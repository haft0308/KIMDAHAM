package homework;
import homework.MyArrayMethod;

///	7-1	///

public class Src06 {

	public static void main(String[] args) {
		
		int MAX = 45;
		int[] arr = new int[MAX];
		int count = 10;
		
		//	init
		arr = MyArrayMethod.InitArr(arr);
		
		//	output
		MyArrayMethod.Print(arr);

		//	swap
		for(int i=0; i<count; i++)
		{
			int index1 = (int)(Math.random()*MAX)+1;
			int index2 = (int)(Math.random()*MAX)+1;
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		}
		
		//	output once again
		MyArrayMethod.Print(arr);
		
		
	}

}
