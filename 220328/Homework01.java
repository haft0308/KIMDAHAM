
public class Homework01 {

	public static void main(String[] args) {

		//	var
		int[][] arrSqr = new int[5][5];
		
		//	input
		for(int i=0; i<arrSqr.length; i++)
		{
			for(int j=0; j<arrSqr[i].length; j++)
			{
				arrSqr[i][j] = (i * 5) + j + 1; 
			}
		}
		
		//	output
		for(int i=0; i<arrSqr.length; i++)
		{
			for(int j=0; j<arrSqr[i].length; j++)
			{
				System.out.print(arrSqr[i][j] + " ");
			}
			
			System.out.println();
		}

	}

}
