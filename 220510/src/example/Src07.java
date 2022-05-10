package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Src07 {

	public static void main(String[] args) {
	
		//	1
		ArrayList<Point> al = new ArrayList<Point>();
		
		//	2
		al.add(new Point());
		al.add(new Point(1, 1));
		al.add(new Point(2, 2));
		
		//	2-1
		System.out.println(al.get(0));
		
		//	3
		System.out.println(al.remove(0));
		
		//	4
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "aaa");
		map.put("age", "21");
		
		//	5
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext())
		{
			String key = iter.next();
			System.out.println(key + " : "  + map.get(key));
		}
		
		//	*
		ArrayList<String> alBunsik = new ArrayList<String>();
		alBunsik.add("김밥");
		alBunsik.add("순대");
		alBunsik.add("떡볶이");
		
		ArrayList<String> alBever = new ArrayList<String>();
		alBever.add("생수");
		alBever.add("커피");
		alBever.add("콜라");
		
		
	}

}

class Point
{
	int x;
	int y;
	
	Point()
	{
		this.x = 0;
		this.y = 0;
	}
	
	Point(int _x, int _y)
	{
		this.x = _x;
		this.y = _y;
	}
}
