package homework;
import java.util.Scanner;

public class MyArrayMethod {

	//	1차원 정수 배열 출력
	public static void Print(int[] _arr)
	{
		System.out.println("print array : int[]");
		
		for(int i=0; i<_arr.length; i++)
		{
			System.out.print(_arr[i] + "\t");
		}
		
		System.out.println();
	}
		
	//	2차원 정수 배열 출력
	public static void Print(int[][] _arr)
	{
		System.out.println("print array : int[][]");
		
		for(int i=0; i<_arr.length; i++)
		{
			for(int j=0; j<_arr[i].length; j++)
			{
				System.out.print(_arr[i][j] + "\t");
			}
			
			System.out.println();
		}	
	}

	//	값으로 인덱스 찾기
	public static int Search(int[] _arr, int _val)
	{
		int index = -1;
		
		for(int i=0; i<_arr.length; i++)
		{
			if(_val == _arr[i])
			{
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	public static int MaxIndex(int[] _arr)
	{
		int maxVal = _arr[0];
		int maxIndex = 0;
		
		for(int i=1; i<_arr.length; i++)
		{
			if(_arr[i] > _arr[i-1])
			{
				maxVal = _arr[i];
				maxIndex = i;
			}
		}
		
		return maxIndex;
	}
	
	public static int MinIndex(int[] _arr)
	{
		int minVal = _arr[0];
		int minIndex = 0;
		
		for(int i=1; i<_arr.length; i++)
		{
			if(_arr[i] < _arr[i-1])
			{
				minVal = _arr[i];
				minIndex = i;
			}
		}
		
		return minIndex;
	}
	
	public static int Sum(int[] _arr)
	{
		int sum = 0;
		
		for(int i=0; i<_arr.length; i++)
		{
			sum += _arr[i];
		}
		
		return sum;
	}
	
	public static float Avg(int[] _arr)
	{
		float avg;
		int sum = Sum(_arr);
		
		avg = sum/_arr.length;
		
		return avg;
	}
	
	public static int[] InputArray(int[] _arr)
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<_arr.length; i++)
		{
			System.out.print("index " + i + " >> ");
			_arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		return _arr;
	}
	
	public static int[][] InputArray(int[][] _arr)
	{
		Scanner sc = new Scanner(System.in);
		
			for(int i=0; i<_arr.length; i++)
			{
				for(int j=0; j<_arr[i].length; j++)
				{
					System.out.print("index " + i + " - " + j + " >> ");
					_arr[i][j] = sc.nextInt();				
				}
			}
		
		sc.close();
		
		return _arr;
	}
	
	//	init array with random value ~_max
	public static int[] InitArrRand(int[] _arr, int _max)
	{
		for(int i=0; i<_arr.length; i++)
		{
			_arr[i] = (int)(Math.random()*_max) + 1;
		}
		
		return _arr;
	}

	//	init array with number 1 ~
	public static int[] InitArr(int[] _arr)
	{
		for(int i=0; i<_arr.length; i++)
		{
			_arr[i] = i + 1;
		}
		
		return _arr;
	}
	
	//	init array with specific value
	public static int[] InitArr(int[] _arr, int _val)
	{
		for(int i=0; i<_arr.length; i++)
		{
			_arr[i] = _val;
		}
		
		return _arr;
	}
	
}
