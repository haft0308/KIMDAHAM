package homework;
import homework.MyArrayMethod;

///	14	///

public class Src12 {

	public static void main(String[] args) {
		
		int[][] score = {	{100, 100, 100},
							{20, 20, 20},
							{30, 30, 30},
							{40, 40, 40},
							{50, 50, 50}	};
		
		int row = score.length;
		int col = score[0].length;
		int[][] scoreClone = new int[row+1][col+1];
		
		//	copy
		for(int i=0; i<score.length; i++)
		{
			for(int j=0; j<score[i].length; j++)
			{
				scoreClone[i][j] = score[i][j];
			}
		}
		
		//	sums on right side
		for(int i=0; i<row; i++)
		{
			int sum = 0;
			
			for(int j=0; j<col; j++)
			{
				sum += scoreClone[i][j];
			}
			
			scoreClone[i][col] = sum;
		}
		
		//	sums on bottom side
		for(int i=0; i<col+1; i++)
		{
			int sum = 0;
			
			for(int j=0; j<row; j++)
			{
				sum += scoreClone[j][i];
			}
			
			scoreClone[row][i] = sum;
		}

		//	print
		MyArrayMethod.Print(scoreClone);
		
	}

}
