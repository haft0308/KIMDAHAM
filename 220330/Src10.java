
public class Src10 {

	//	12	//
	//	XXXXXXXXX	//
	
	static void Print(char[][] _arr)
	{
		for(int i=0; i<_arr.length; i++)
		{
			for(int j=0; j<_arr[i].length; j++)
			{
				System.out.print(_arr[i][j]);
				System.out.print("\t");
			}
			
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		//	var
		char[][] arr = {
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'}};
		int row = arr.length;
		int col = arr[0].length;
		char[][] arrTilt = new char[col][row];
		
		//	print original array first
		System.out.println("Original Array [" + row + "][" + col + "]" );
		Print(arr);
		
		//	tilt
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arrTilt[j][arrTilt[i].length-1-i] = arr[i][j];
			}
		}
		
		//	print tilted array
		System.out.println("Tilted Array [" + col + "][" + row + "]" );
		Print(arrTilt);
		
	}

}