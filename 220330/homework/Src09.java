package homework;
import homework.MyArrayMethod;

///	11	///

public class Src09 {

	public static void main(String[] args) {
		
		int ROW = 10;	//	row
		int RAN = 5;	//	range 1~
		int[] answer = new int[ROW];
		int[] count = new int[RAN];
		
		//	initialize array 1~5
		MyArrayMethod.InitArrRand(answer, RAN);
		MyArrayMethod.InitArr(count, 0);
		
		//	count
		for(int i=0; i<answer.length; i++)
		{
			int j = answer[i];
			count[j-1] += 1;
		}
		
		//	output array
		MyArrayMethod.Print(answer);
		
		//	draw stars
		for(int i=0; i<count.length; i++)
		{
			System.out.print("num " + (i+1) + " ");
			
			for(int j=0; j<count[i]; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
