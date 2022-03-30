package homework;

public class Src10 {

	//	12	//
	//	XXXXXXXXX	//
	
	public static void main(String[] args) {
		
		char[][] arr = {
							{'*', '*', ' ', ' ', ' '},
							{'*', '*', ' ', ' ', ' '},
							{'*', '*', '*', '*', '*'},
							{'*', '*', '*', '*', '*'}};
		int row = arr[0].length;
		int col = arr.length;
				
		char[][] arr_tilt = new char[col][row];
		
		//	tilt
		for(int i=0; i<arr_tilt.length; i++)
		{
			for(int j=0; j<arr_tilt[i].length; j++)
			{
				arr_tilt[i][j] = arr[Math.abs(col-1-j)][i];
			}
		}
		
		//	print
		for(int i=0; i<arr_tilt.length; i++)
		{
			for(int j=0; j<arr_tilt[i].length; j++)
			{
				System.out.print(arr_tilt[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
