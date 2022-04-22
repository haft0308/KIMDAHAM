package example;

public class Cat extends Animal
{
	Cat(String _name)
	{
		super(_name);
	}
	
	public void cry()
	{
		super.cry();
		System.out.println("야옹");
	}
	
	public void grooming()
	{
		System.out.println(this.name + "(이)가 그루밍한다.");
	}
}
