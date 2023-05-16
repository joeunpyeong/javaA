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
		//Jsoup API�� ����ϱ� : http���·� �Ǿ��ִ� �����͸� json �Ǵ� xml���� ���·� String���� ������
		//String�� JsonParser, JsonObject �� �̿��Ͽ� �츮�� Ȱ�밡���� ����Ÿ������ ������ ������ �۾��� �Ѵ�.
		//http�� ��û�� ���ͳ��ּ��� URL�� �˾ƾ��� URL�������� ?�� �Ǿ��ִ� �Ķ���͸� ��Ȯ�ϰ� �־��, ���ϴ� ����� ���� �� �ִ�.
		//�츮�� ���ͳ� �ּҿ� ��û�Ҷ� �����ִ� �Ķ���ʹ� ���� String
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
		//json : key�� value�� ���еǾ��ִ� ��Ģ�� ���� ������ Ÿ��(String)�̴�.
		//�߰�ȣ : �ϳ��� Object (int, String, DTO ��)
		//���ȣ : array �� ���� �����͸� ������ ���� ����
		
		//JsonParser�� �̿��ؼ� String���� �Ǿ��ִ� Json�� �ϳ��� ������ �۾��� �� ����.
		JSONParser parser = new JSONParser();//���ڿ� =>JsonObject���·� �ٲ���
		try {
			JSONObject jsonObj= (JSONObject) parser.parse(doc);
			System.out.println("�Ľ̼���");
			JSONArray array =(JSONArray) jsonObj.get("data");
			System.out.println("array��� ����(JsonArray)\n");
			for(int i=0;i<array.size();i++) {
				JSONObject tempObj = (JSONObject) array.get(i);
				System.out.println("��ȣ�� :"+tempObj.get("��ȣ��"));
				System.out.println("���������θ��ּ� :"+tempObj.get("���������θ��ּ�"));
				System.out.println("��ȭ��ȣ :"+tempObj.get("��ȭ��ȣ")+"\n");
			}
			
		} catch (ParseException e) {
			// String json�� key�� value�� ���� �����Ͱ� �ƴ� �׳� �Ϲ� ���ڿ� �̶�� ������ �߻��Ѵ�.
			e.printStackTrace();
		}
		
		
		System.out.println(doc);
	}
}
