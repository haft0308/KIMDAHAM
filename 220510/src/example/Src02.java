package example;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Src02 {

	public static void main(String[] args) {
		
		//	map, hashmap
		
		// #1
		
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("name", "kimdaham");
		map.put("tel", "01090993343");
		map.put("addr", "노원구");
		

		//	입력한 key로 value 찾아 출력
		String key = "";
		String value = null;
		System.out.print("input key >> ");
		key = sc.next();
		
		if(map.containsKey(key))
		{
			value = map.get(key);
			System.out.println(value);
		}
		else
		{
			System.out.println("일치사항 없음");
		}
		
		//	#2
		System.out.println();
		
		Object[] keys = map.keySet().toArray();
		String str = null;
		
		System.out.println("map의 전체 key 출력");
		for(int i = 0; i<keys.length; i++)
		{
			str = (String)keys[i];
			System.out.println("\t" + str);
		}
		
		//	이미 존재하는 keys arrayList를, 순차적으로 get()하여 value를 출력
		System.out.println("map의 전체 value 출력 1");
		for(int i=0; i<keys.length; i++)
		{
			str = map.get(keys[i]);
			System.out.println("\t" + str);
		}
				
		//	map.values()를 사용하여 value 만을 뽑아낸 새로운 array를 만듦.
		System.out.println("map의 전체 value 출력 2");
		Object[] values = map.values().toArray();
		for(int i=0; i<values.length; i++)
		{
			str = (String)values[i];
			System.out.println("\t" + str);
		}
		
		sc.close();
	}

}
