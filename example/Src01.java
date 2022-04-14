package example;

//	homework last time

public class Src01
{
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		int result;
		
		Test test = new Test(arr);
		result = test.sum(arr);

		System.out.println(result);
	}
}

class Test
{
	private int total = 0;
	
	//	constructor
	Test(int[] _arr)
	{
		sum(_arr);
	}
	
	//	method sum
	int sum(int[] _arr)
	{
		total = 0;
		
		for(int i=0; i<_arr.length; i++)
		{
			total += _arr[i];
		}
				
		return total;
	}
	
	//	method getTotal
	int getTotal()
	{
		return total;
	}
	
}
