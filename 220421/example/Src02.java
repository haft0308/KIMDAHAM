package example;

public class Src02 {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.name = "parent";
		p.printInfo();
		
		System.out.println("===================");
		
		Child c = new Child();
		c.name = "child";
		c.setHobby("swimming");
		c.printInfo();
		
	}

}


class Parent
{
	protected String name;
	
	public void printInfo()
	{
		System.out.println(name);
	}
}

class Child extends Parent
{
	private String hobby;
	
	public void printInfo()
	{
		System.out.println(name);
		System.out.println(hobby);
	}
	
	public void setHobby(String hobby)
	{
		this.hobby = hobby;
	}
	
	public String getHobby()
	{
		return hobby;
	}
}

