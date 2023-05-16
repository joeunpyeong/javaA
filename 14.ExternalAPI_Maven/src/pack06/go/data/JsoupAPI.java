package pack06.go.data;

import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;
import org.junit.rules.Timeout;

import oracle.jdbc.driver.json.tree.JsonpArrayImpl;

public class JsoupAPI {
	public static void main(String[] args) {
		//Jsoup API를 사용하기 : http형태로 되어있는 데이터를 json 또는 xml등의 형태로 String으로 가져옴
		//String을 JsonParser, JsonObject 를 이용하여 우리가 활용가능한 변수타입으로 각각을 빼오는 작업을 한다.
		//http의 요청은 인터넷주소인 URL을 알아야함 URL기준으로 ?로 되어있는 파라메터를 정확하게 넣어야, 원하는 결과를 얻을 수 있다.
		//우리가 인터넷 주소에 요청할때 보내주는 파라메터는 전부 String
		String url="https://api.odcloud.kr/api/3082925/v1/uddi:b4759786-c28c-41dd-b600-a9abdbec3ae1";
		String doc=null;
		try {
			doc = Jsoup.connect(url).data("page","2").data("perPage","10")
			.data("serviceKey","ojZeYCAVIX2R3fj08vvkwouJnOrngYIt2bevAfkSrbGeU8ZsRWvWbw2q5NDhIZH3KsF3qdO/TMv8vM8Nd+3piA==")
			.timeout(1000*10)
			.userAgent("Chome")
			.ignoreContentType(true)
			.execute().body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//json : key와 value로 구분되어있는 규칙을 가진 데이터 타입(String)이다.
		//중괄호 : 하나의 Object (int, String, DTO 등)
		//대괄호 : array ↑ 위의 데이터를 여러건 가진 형태
		
		//JsonParser를 이용해서 String으로 되어있는 Json을 하나씩 빼오는 작업을 할 예정.
		JSONParser parser = new JSONParser();//문자열 =>JsonObject형태로 바꿔줌
		try {
			JSONObject jsonObj= (JSONObject) parser.parse(doc);
			System.out.println("파싱성공");
			JSONArray array =(JSONArray) jsonObj.get("data");
			System.out.println("array담기 성공(JsonArray)\n");
			for(int i=0;i<array.size();i++) {
				JSONObject tempObj = (JSONObject) array.get(i);
				System.out.println("상호명 :"+tempObj.get("상호명"));
				System.out.println("소재지도로명주소 :"+tempObj.get("소재지도로명주소"));
				System.out.println("전화번호 :"+tempObj.get("전화번호")+"\n");
			}
			
		} catch (ParseException e) {
			// String json이 key와 value를 가진 데이터가 아닌 그냥 일반 문자열 이라면 오류가 발생한다.
			e.printStackTrace();
		}
		
		
		System.out.println(doc);
	}
}
