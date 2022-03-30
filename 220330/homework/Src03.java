package homework;
import homework.MyArrayMethod;
import java.util.Scanner;

///	5	///

public class Src03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		
		//	input
		MyArrayMethod.InputArray(array);
		
		//	get max index & min index
		int maxIndex = MyArrayMethod.MaxIndex(array);
		int minIndex = MyArrayMethod.MinIndex(array);
		
		//	output
		System.out.println("max [index] value : [" + maxIndex + "] " + array[maxIndex]);
		System.out.println("min [index] value : [" + minIndex + "] " + array[minIndex]);

	}

}
