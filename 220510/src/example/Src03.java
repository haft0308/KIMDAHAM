package example;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Src03 {

	public static void main(String[] args) {
		
		//	map iterator
		
		//	#1
		Map<String, String> map = new HashMap<String, String>();
		map.put("class", "IOT");
		map.put("degree", "3");
		map.put("name", "kimdaham");
		
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext())
		{
			System.out.println(map.get(iter.next()));
		}
		
		//	#2
		System.out.println("Iterator를 key에 연결 1");
		Iterator<String> keyIterator = map.keySet().iterator();
		while(keyIterator.hasNext())
		{
			String key = keyIterator.next();
			System.out.println(key + " : " + map.get(key));
		}

		//	#3
		System.out.println("Iterator를 key에 연결 2");
		Iterator<String> valueIterator = map.values().iterator();
		while(valueIterator.hasNext())
		{
			System.out.println(valueIterator.next());
		}
		
	}

}
