package homework;
import homework.MyArrayMethod;


///	8	///

public class Src07 {

	public static void main(String[] args) {
		
		int ROW = 3;
		int COL = 3;
		int[][] score = new int[ROW][COL];
		
		//	input
		MyArrayMethod.InputArray(score);
		
		//	sum
		int[] sum = new int[ROW];
		
		for(int i=0; i<ROW; i++)
		{
			sum[i] = MyArrayMethod.Sum(score[i]);
		}
		
		//	print
		System.out.println("국어\t영어\t수학\t총점");
		for(int i=0; i<ROW; i++)
		{
			for(int j=0; j<COL; j++)
			{
				System.out.print(score[i][j] + "\t");
			}
			
			System.out.println(sum[i]);
		}
				
	}

}
