package example;

//	constructor example #2

public class Src03 {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		Member m2 = new Member("abc");
		Member m3 = new Member("def", "01099998888", "home");

		m1.print();
		m2.print();
		m3.print();

		//	return this
		Member m4 = new Member("ghi", "01011112222", "h");	// ghi, 01011112222, h	
		m4 = m1.getMember();	// null, null, null
		m4.print();	// null, null, null
	}

}

class Member
{
	private String name;
	private String tel;
	private String addr;
	
	Member()
	{
		this.name = null;
		this.tel = null;
		this.addr = null;
	}

	Member(String _name)
	{
		this.name = _name;
		this.tel = null;
		this.addr = null;
	}
	
	Member(String _name, String _tel, String _addr)
	{
		this.name = _name;
		this.tel = _tel;
		this.addr = _addr;
	}

	Member getMember()
	{
		return this;
	}
	
	void print()
	{
		System.out.println("name : " + this.name);
		System.out.println("tel : " + this.tel);
		System.out.println("addr : " + this.addr);
		System.out.println();
	}
	
}
