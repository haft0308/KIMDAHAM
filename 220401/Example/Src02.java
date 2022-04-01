package Example;

public class Src02 {

	public static void main(String[] args) {
		
		int a = 10, b = 5;
		
		System.out.println("before call --");
		System.out.println(a);
		System.out.println(b);
		
		addOne(a, b);

		System.out.println("after call --");
		System.out.println(a);
		System.out.println(b);
		
	}

	static void addOne(int x, int y)
	{
		x++;
		y++;
		System.out.println("function addOne()");
		System.out.println(x);
		System.out.println(y);
	}
	
}
