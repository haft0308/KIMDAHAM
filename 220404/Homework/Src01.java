
package Homework;

/// 220401 - Homework - Src02.java에 reverse() 추가 ///

public class Src01 {

	static int makeMax(int[] _arr)
	{
		int result = _arr[0];
		
		for(int i=1; i<_arr.length; i++)
		{
			if(_arr[i] > result)
			{
				result = _arr[i];
			}
		}
		
		return result;
	}
	
	static int makeSum(int[] _arr)
	{
		int result = 0;
		
		for(int i=0; i<_arr.length; i++)
		{
			result += _arr[i];
		}
		
		return result;
	}
	
	static float makeAvg(int[] _arr)
	{
		float result;
		
		result = (float)makeSum(_arr);
		result /= _arr.length;
		
		return result;
	}
	
	static int[] reverse(int[] _arr)
	{
		int[] newArr = new int[_arr.length];

		
		for(int i=0; i<_arr.length; i++)
		{
			newArr[_arr.length-1-i] = _arr[i];
		}
		
		return newArr;
	}
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int max = 0;
		int sum = 0;
		float avg = 0.0f;
		
		max = makeMax(arr1);
		System.out.println("max : " + max);
		
		sum = makeSum(arr1);
		System.out.println("sum : " + sum);
		
		avg = makeMax(arr1);
		System.out.println("avg : " + avg);
		
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] arr4 = reverse(arr3);
		
		//	print reverse array
		System.out.print("reverse : ");
		for(int i=0; i<arr3.length; i++)
		{
			System.out.print(arr4[i] + " ");
		}
	}

}