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
		System.out.println("�߿�");
	}
	
	public void grooming()
	{
		System.out.println(this.name + "(��)�� �׷���Ѵ�.");
	}
}
