package Example;

public class Src05 {

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
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int max = 0;
		int sum = 0;
		float avg = 0.0f;
		
		max = makeMax(arr1);
		System.out.println(max);
		
		sum = makeSum(arr1);
		System.out.println(sum);
		
		avg = makeMax(arr1);
		System.out.println(avg);
		
	}

}
