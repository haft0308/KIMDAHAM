package homework;

///	1.

public class Src01 {

	static int sum(int[] _arr)
	{
		int result = 0;
		
		for(int i = 0; i<_arr.length; i++)
			result += _arr[i];
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int x, y;
		int[] a1 = {1, 2, 3};
		int[] a2 = {4, 5, 6};
		
		x = sum(a1); 
		y = sum(a2);
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
	}

}
