package example;

public class Src04 {

	public static void main(String[] args) {
		
		//	upCasting between basic types
		//	int -> long
		int i1 = 5;
		long l1 = i1;
		System.out.println(l1);
		
		System.out.println("=================");
		
		//	downCasting between basic types
		//	long -> int
		long l2 = 5;
		int i2 = (int)l2;
		System.out.println(i2);

		System.out.println("=================");
		
		//	upCasting between class types
		//	child -> parent
		NewChild c1 = new NewChild();
		NewParent p1 = c1;
		p1.name = "parent";
		p1.printInfo();
		
		System.out.println("=================");
		
		//	downCasting between class types
		//	parent -> child
		/*
		 * NewParent p2 = new NewParent();
		 * NewChild c2 = (NewChild)p2; // ERROR
		 * c2.printInfo();
		 */
		
		System.out.println("=================");
		
		//	another downCasting case :
		//	upCast & downCast
		NewParent np = new NewChild();	//	type : Newparent, assignment : NewChild
		NewChild nc = (NewChild)np;
		
		nc.name = "child";
		nc.setHobby("EEEEE");
		nc.printInfo();
		
	}
}

class NewParent
{
	String name = null;
	
	void printInfo()
	{
		System.out.println(name);
	}
	
	//	upCasting method
	NewChild castNewChild()
	{
		NewChild castResult = new NewChild();
		return castResult;
	}
}

class NewChild extends NewParent
{
	String hobby = null;
	
	void printInfo()
	{
		System.out.println(name);
		System.out.println(hobby);
	}
	
	void setHobby(String hobby)
	{
		this.hobby = hobby;
	}
	
	String getHobby()
	{
		return hobby;
	}
}

