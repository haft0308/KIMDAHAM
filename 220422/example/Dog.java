package example;

public class Dog extends Animal
{
	Dog(String _name)
	{
		super(_name);
	}
	
	public void cry()
	{
		super.cry();
		System.out.println("�۸�");
	}
	
	public void run()
	{
		System.out.println(this.name + "(��)�� �ڴ�.");
	}
}
