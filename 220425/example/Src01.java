package example;

public class Src01 {

	public static void main(String[] args)
	{
		GrandParent gp = new Child();

		gp.name = "grand papa";
		gp.age = 100;
		gp.print();
		gp.test();
		
		System.out.println("==================");
		
		Child c = new Child();
		c.name = "child coco";
		c.age = 10;
		c.hobby = "study";
		c.print();
		c.test();
		
	}

}

abstract class GrandParent
{
	protected String name = "";
	protected int age = 0;
	
	GrandParent()
	{
		System.out.println("GrandParent ()");
	}
	
	public abstract void print();
	public abstract void test();
}

abstract class Parent extends GrandParent
{
	Parent()
	{
		System.out.println("Parent()");
	}
	
	public void print()
	{
		System.out.println("parent");
		System.out.println("name : " + name);
	}
}


class Child extends Parent
{
	protected String hobby = "";
	
	Child()
	{
		System.out.println("Child()");
	}
	
	public void print()
	{
		System.out.println("child");
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	
	public void test()
	{
		System.out.println("hobby : " + hobby);
	}
	
	public void ParentPrint()
	{
		super.print();
	}
}
