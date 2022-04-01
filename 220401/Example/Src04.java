package Example;

public class Src04 {

	public static void main(String[] args) {
		
		int result_int = 0;
		float result_float = 0;
		int a = 3, b = 5;
		float x = 3.2f, y = 8.5f;
		String result_string = null;
		String str1 = new String("aaa");
		String str2 = new String("bbb");
		
		result_int = add_int(a,b);
		System.out.println(result_int);
		
		result_float = add_float(x, y);
		System.out.println(result_float);
		
		result_string = add_string(str1, str2);
		System.out.println(result_string);

	}

	static int add_int(int a, int b)
	{
		int c = 0;
		c = a + b;
		return c;
	}
	
	static float add_float(float a, float b)
	{
		float c = 0;
		c = a + b;
		return c;
	}
	
	static String add_string(String str, String str2)
	{
		String str3 = null;
		str3 = str + str2;
		return str3;
	}
	
}
