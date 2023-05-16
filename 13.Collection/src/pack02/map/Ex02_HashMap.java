package pack02.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex02_HashMap {
	public static void main(String[] args) {
		//Map컬렉션은 <class, class> :클래스타입이 두개들어ㅏㅁ
		//첫번째것은 데이터를 식별하기 위한 키값, 두번째것은 ㅔ이터값
		//Map<K,V> Key,Value 의미
		
		Map<String,Integer> map = new HashMap<>();
		map.put("신용권", 95);
		map.put("홍길동", 50);
		map.put("임꺽정", 60);
		map.put("신용권", 100);
		//Key는 데이터를 유일하ㅔ 식별할 수 있는 값이어야 한다. ex)동명이인이 있는 경우 이름은 key로서 기능을 상실
		
		System.out.println("map Entry(객체) 수:"+map.size());
		
		System.out.println("신용권의 점수 :"+map.get("신용권"));
		//${map.data}
		//자바코드로 데이터를 뺴올일은 거의 없음
		//예제로 한번만 확인하고 넘어가면됨
		
		Set<String> keySet=map.keySet();
		Iterator<String> keyIterator=keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("key:"+key+"value:"+value);
		}
		
		for(String key: map.keySet()) {
			Integer value = map.get(key);
			System.out.println("key:"+key+"value:"+value);			
		}
		
	}
}
