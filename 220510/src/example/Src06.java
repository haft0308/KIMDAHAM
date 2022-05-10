package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Src06 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("tu");
		list.add("sd");
		list.add("abr");
		
		//	정렬
		System.out.println("정렬");
		Collections.sort(list);	//	오름차순 정렬
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
		{
			System.out.println("\t" + iter.next());
		}
		
		//	검색
		System.out.println("검색");
		int idx = -1;
		idx = Collections.binarySearch(list, "tu");
		
		if(idx < 0)
		{
			System.out.println("\t" + "None");
		}
		else
		{
			System.out.println("\t" + idx + " : " + list.get(idx));
		}
		
		//	셔플
		System.out.println("셔플");
		Iterator<String> iter2 = list.iterator();
		Collections.shuffle(list);
		while(iter2.hasNext())
		{
			System.out.println("\t" + iter2.next());
		}


	}

}
