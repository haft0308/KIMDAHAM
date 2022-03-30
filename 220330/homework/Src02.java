package homework;
import homework.MyArrayMethod;

///	4	///

public class Src02 {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		//	4
		//	input
		array = MyArrayMethod.InputArray(array);

		//	output
		MyArrayMethod.Print(array);
		
		//	4-1
		//	exchange
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		
		//	output
		MyArrayMethod.Print(array);
		
	}

}
