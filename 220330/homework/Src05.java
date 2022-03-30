package homework;
import homework.MyArrayMethod;
import java.util.Scanner;

///	7	///

public class Src05 {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		//	initialize array with random ints
		MyArrayMethod.InitArrRand(array, 10);
		
		//	search index with val
		int index = MyArrayMethod.Search(array, 0);
		
		//	output
		MyArrayMethod.Print(array);
	}

}
