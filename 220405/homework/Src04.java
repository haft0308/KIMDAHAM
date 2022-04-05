package homework;
import java.util.Scanner;

//	11.

public class Src04 {

	static void printArrayVisual(int[] _arr, String _str)
	{
		for(int i=0; i<_arr.length; i++)
		{	
			for(int j=0; j<_arr[i]; j++)
			{
				System.out.print(_str);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};

		System.out.print("input any character/string >> ");
		String str = sc.next();
		
		printArrayVisual(arr, str);
		
	}
}
