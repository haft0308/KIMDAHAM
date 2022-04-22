package example;

public class Animal
{
	protected String name;
	
	Animal()
	{
		this.name = null;
	}
	
	Animal(String _name)
	{
		this.name = _name;
	}
	
	public void cry()
	{
		System.out.println(name + "(��)�� �Ҹ�����.");
	}
	
	public void setName(String _name)
	{
		this.name = _name;
	}
	
	public String getName()
	{
		return this.name;
	}
}
