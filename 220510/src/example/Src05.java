package example;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Src05 {

	public static void main(String[] args) {
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("바나나", "banana");
		map1.put("오렌지", "orange");
		map1.put("사과", "apple");

		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("생수", "water");
		map2.put("초코우유", "chocolate-milk");
		map2.put("커피", "coffee");
		
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		list.add(map1);
		list.add(map2);
		
		for(int i=0; i<list.size(); i++)
		{
			Object[] tempArr = list.get(i).keySet().toArray();
			
			for(int j=0; j<list.get(i).size(); j++)
			{
				System.out.println(tempArr[j] + " : " + list.get(i).get(tempArr[j]));
			}
			System.out.println();
		}
		
		
	}

}
