package homework;
import homework.MyArrayMethod;

///	1	///

public class Src01 {

	public static void main(String[] args) {

		int[] array = new int[10];
		
		for(int i=0; i<array.length; i++)
		{
			array[i] = i + 1;
		}

		MyArrayMethod.Print(array);
		
	}

}
