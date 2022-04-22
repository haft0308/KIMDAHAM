package example;

public class Src02 {

	public static void main(String[] args) {
		
		SuperParent sp = new SuperChild();
		sp.print();

	}
}

class SuperParent
{
	protected int a = 10;
	
	public void print()
	{
		System.out.println("SuperParent¿« print()");
		System.out.println("a = " + a + "\n");
	}
}

class SuperChild extends SuperParent
{
	private int a = 20;
	
	public void print()
	{
		System.out.println("SuperChild¿« print()");
		System.out.println("a = " + a + "\n");
		SuperCall();
	}
	
	public void SuperCall()
	{
		super.print();
	}
}