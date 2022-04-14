package example;

//	constructor example #1

public class Src02 {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point(5, 6);
		
		p1.print();
		System.out.println(String.format("dist : %.2f", p1.dist()));
		System.out.println(String.format("area : %d", p1.square()));
		
		p2.print();
		System.out.println(String.format("dist : %.2f", p2.dist()));
		System.out.println(String.format("area : %d", p2.square()));
	}
}

class Point
{
	private int x;
	private int y;
	
	//	constructor #1
	Point()
	{
		this.x = 0;
		this.y = 0;
	}
	
	//	constructor #2
	Point(int _x, int _y)
	{
		this.x = _x;
		this.y = _y;
	}
	
	//	get
	int[] getPoint()
	{
		int[] tempArr = {this.x, this.y};
		
		return tempArr;
	}
	
	// set
	void setPoint(int _x, int _y)
	{
		this.x = _x;
		this.y = _y;
	}
	
	//	return distance from origin point
	float dist()
	{
		float result = (float)Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
		
		return result;
	}
	
	//	return square area from origin point
	int square()
	{
		int result = this.x * this.y;
		
		return result;
	}
	
	//	print
	void print()
	{
		System.out.println("[" + this.x + ", " + this.y + "]");
	}
	
}