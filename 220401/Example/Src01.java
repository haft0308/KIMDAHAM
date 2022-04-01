package Example;

	///	call of method	///

public class Src01 {


	static int[] change(int _a, int _b)
	{
		int[] res = {_b, _a};
		
		return res;
	}

	public static void main(String[] args) {
		
		int a = 9, b = 2, d;
		int[] c = change(a, b);

		
	}

}
