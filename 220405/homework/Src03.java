package homework;

//	4. 5.

public class Src03 {

	static int rand(int _min, int _max)
	{
		int result = (int)(Math.random()*(_max-_min+1)) + _min;
		
		return result;
	}
	
	//	print array
	static void printArr(String _str, int[] _arr)
	{
		System.out.println(_str + " ---------------------------");
		
		for(int i=0; i<_arr.length; i++)
		{
			System.out.print(_arr[i] + " ");
		}
		
	}
	
	public static void main(String[] args)
	{

		// 4.
		for(int i=0; i<10; i++)
		{
			int tempNum = rand(1, 10);
			System.out.print(tempNum + ", ");
		}
		System.out.println();

		//	5.
		int[] arr = new int[3];
		
		//	initialize array with random nums
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = rand(1, 9);
		}
		
		//	check and correct
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					arr[j] = rand(1, 9);
					j--;
					continue;
				}
			}
		}
		
		printArr("result", arr);
		
	}

}
