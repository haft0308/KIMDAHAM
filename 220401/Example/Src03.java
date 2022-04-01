package Example;

public class Src03 {

	static int add(int a, int b)
	{
		int c = a + b;
		return c;
	}
	
	static void print()
	{
		System.out.println("before return");
		return;
	}
	
	static int retInt()
	{
		int x = 10;
		return x;
	}
	
	static void noRet(int x)
	{
		System.out.println("x=" + x);
	}
	
	//	main
	public static void main(String[] args)
	{
		int a=1, b=2, c;

		c = add(a, b);
		print();
		
		a = retInt();
		noRet(b);
	}

}
