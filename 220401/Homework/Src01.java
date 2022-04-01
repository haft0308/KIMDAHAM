package Homework;

public class Src01 {

	int value;
	
	Src01(int _value)
	{
		value = _value;
	}
	
	static void addOne(int x, int y)
	{
		x++;
		y++;
		System.out.println("function addOne()");
		System.out.println(x + ", " + y);
	}

	static void addOne(Src01 a, Src01 b)
	{
		a.value++;
		b.value++;
		System.out.println("function addOne()");
		System.out.println(a.value + ", " + b.value);
	}
	
	public static void main(String[] args) {
		
		//	# 1
		//	after call --
		//	10, 5	
		int a = 10, b = 5;

		System.out.println("before call --");
		System.out.println(a + ", " + b);

		addOne(a, b);

		System.out.println("after call --");
		System.out.println(a + ", " + b);

		
		//	# 2
		//	after call --
		//	11, 6
		Src01 s1 = new Src01(10);
		Src01 s2 = new Src01(5);
		
		System.out.println("before call --");
		System.out.println(s1.value + ", " + s2.value);

		addOne(s1, s2);

		System.out.println("after call --");
		System.out.println(s1.value + ", " + s2.value);

	}
	
}
