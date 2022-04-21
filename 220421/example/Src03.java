package example;

//	overloading, overriding

public class Src03 {

	public static void main(String[] args) {
		
		A a = new A();
		a.hello();
		a.bye();
		
		System.out.println("===============");
		
		B b = new B();
		b.hello();
		b.bye("개똥아");
	}
}

class A
{
	void hello()
	{
		System.out.println("A says hello");
	}
	
	void bye()
	{
		System.out.println("잘가");
	}
	
	void bye(String _name)
	{
		System.out.println(_name + ", 잘가");
	}
}

class B extends A
{
	void hello()
	{
		System.out.println("B says hello");
		System.out.println("hahahaha");
	}
	
	void bye()
	{
		System.out.println("들어가");
	}
	
	void bye(String _name)
	{
		System.out.println(_name + ", 들어가");
	}
}