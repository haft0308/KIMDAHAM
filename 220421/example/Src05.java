package example;

public class Src05 {

	public static void main(String[] args) {
		
		// upcasting
		//	>> 200
		Parent2 p = new Child2();
		p.method();
		p.parentMethod();
		
		System.out.println("===================");
		
		//	normal
		//	>> 200
		Child2 c = new Child2();
		c.method();
		c.parentMethod();
		c.childMethod();

		System.out.println("===================");
		
		//	up & downcasting
		 //	>> 200
		 Child2 c2 = new Child2();
		 Parent2 p2 = c2;
		 Child2 c3 = (Child2)p2;
		 c3.method();
		 c3.parentMethod();
		 c3.childMethod();
		
	}

}

class Parent2
{
	int x;
	
	Parent2()
	{
		this.x = 100;
	}
	
	void method()
	{
		System.out.println("Parent2.x : " + this.x);
	}
	
	void parentMethod()
	{
		System.out.println("this is Parental method");
	}
	
}

class Child2 extends Parent2
{
	int x;
	
	Child2()
	{
		this.x = 200;
	}
	
	void method()
	{
		System.out.println("Child2.x : " + this.x);
	}
	
	void childMethod()
	{
		System.out.println("this is Child method");
	}
}
