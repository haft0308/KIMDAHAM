package example;

public class Src03
{
	public static void main(String[] args)
	{
		SuperConChild c = new SuperConChild(1, 2, 3);
		c.print();

	}
}

class SuperConParent
{
	private int a;
	private int b;
	
	public SuperConParent()
	{
		System.out.println("SuperConParent()");
		this.a = 0;
		this.b = 0;
	}
	
	public SuperConParent(int _a, int _b)
	{
		System.out.println("SuperConParent()");
		this.a = _a;
		this.b = _b;
	}
	
	public void print()
	{
		System.out.println("a : " + a + ", b : " + b);
	}
}

class SuperConChild extends SuperConParent
{
	private int c;
	
	public SuperConChild()
	{
		super();
		this.c = 0;
	}
	
	public SuperConChild(int _a, int _b, int _c)
	{
		super(_a, _b);
		this.c = _c;
		System.out.println("SuperConChild()");
	}
	
	public void print()
	{
		super.print();
		System.out.println("c : " + c);
	}
}