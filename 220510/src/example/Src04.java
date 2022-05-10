package example;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Src04 {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 100);
		map.put(2, 140);
		map.put(3, 5120);
		map.put(4, 6550);
		map.put(5, 8880);
		
		System.out.println("Iterator");
		Iterator<Integer> iter = map.keySet().iterator();
		while(iter.hasNext())
		{
			Object obj = iter.next();
			System.out.println(obj + " : " + map.get(obj));
		}
		
		System.out.println();
		
		System.out.println("Array");
		Object[] objList = map.keySet().toArray();
		for(int i=0; i<objList.length; i++)
		{
			System.out.println(objList[i] + " : " + map.get(objList[i]));
		}
		
	}

}
