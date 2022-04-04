package Example;

///	재귀함수	///

public class Src02 {

	static int compute(int x)
	{
		int ret = 0;
		
		if(x == 1)
			ret = 1;
		else
			ret = x * (compute(x-1));
		
		System.out.println(x + " : " + ret);
		return ret;
	}
	
	public static void main(String[] args) {
		
		int result = compute(4);
		System.out.println(result);
		
	}

}
