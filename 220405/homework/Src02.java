package homework;

//	2. 3.

public class Src02 {

	//	create random array
	static int[][] createRandArr(int _row, int _col)
	{
		int[][] arr = new int[_row][_col];
		
		for(int i=0; i<_row; i++)
		{
			for(int j=0; j<_col; j++)
			{
				arr[i][j] = (int)(Math.random() * 9) + 1;
			}
		}
		
		return arr;
	}
	
	//	create zero array
	static int[][] createZeroArr(int _row, int _col)
	{
		int[][] arr = new int[_row][_col];
		
		for(int i=0; i<_row; i++)
		{
			for(int j=0; j<_col; j++)
			{
				arr[i][j] = 0;
			}
		}
		
		return arr;
	}
	
	//	sum between two arrays
	static int[][] sum(int[][] _arrA, int[][] _arrB)
	{
		int[][] sumArr = new int[_arrA.length][_arrA[0].length];
		
		//	if two arrays are NOT compatible for each other
		if(_arrA.length != _arrB.length)
		{
			System.out.println("ERR : arrays are not compatible for each other");
			int[][] tempArr = createZeroArr(_arrA.length, _arrA[0].length);
			return tempArr;	
		}
		
		for(int i=0; i<_arrA.length; i++)
		{
			//	if two arrays are NOT compatible for each other
			if(_arrA[i].length != _arrB[i].length)
			{
				System.out.println("ERR : arrays are not compatible for each other");
				int[][] tempArr = createZeroArr(_arrA.length, _arrA[0].length);
				return tempArr;
			}
			
			for(int j=0; j<_arrA[i].length; j++)
			{
				sumArr[i][j] = _arrA[i][j] + _arrB[i][j];
			}
		}
		
		return sumArr;
	}
	
	//	multiply between two arrays
	static int[][] mul(int[][] _arrA, int[][] _arrB)
	{
		int[][] mulArr = new int[_arrA.length][_arrA[0].length];
		
		//	if two arrays are NOT compatible for each other
		if(_arrA.length != _arrB.length)
		{
			System.out.println("ERR : arrays are not compatible for each other");
			int[][] tempArr = createZeroArr(_arrA.length, _arrA[0].length);
			return tempArr;	
		}
		
		for(int i=0; i<_arrA.length; i++)
		{
			//	if two arrays are NOT compatible for each other
			if(_arrA[i].length != _arrB[i].length)
			{
				System.out.println("ERR : arrays are not compatible for each other");
				int[][] tempArr = createZeroArr(_arrA.length, _arrA[0].length);
				return tempArr;
			}
			
			for(int j=0; j<_arrA[i].length; j++)
			{
				mulArr[i][j] = _arrA[i][j] * _arrB[i][j];
			}
		}
		
		return mulArr;
	}
	
	//	print array
	static void printArr(String _str, int[][] _arr)
	{
		System.out.println(_str + " ---------------------------");
		
		for(int i=0; i<_arr.length; i++)
		{
			for(int j=0; j<_arr[i].length; j++)
			{
				System.out.print(_arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args)
	{
		int[][] arr1 = createRandArr(2, 4);
		int[][] arr2 = createRandArr(2, 4);
		
		int[][] sumArr = sum(arr1, arr2);
		int[][] mulArr = mul(arr1, arr2);
		
		printArr("arr1", arr1);
		printArr("arr2", arr2);
		printArr("SUM", sumArr);
		printArr("MUL", mulArr);
		
	}

}
