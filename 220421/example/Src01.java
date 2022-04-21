package example;

public class Src01 {

	public static void main(String[] args) {
		
		Point pt1 = new Point();
		Point pt2 = new Point(2, 2);
		
		Rectangle r = new Rectangle(pt1, pt2);
		int area = r.area();
		
		System.out.println("area of rect : " + area);
		
		Cube c = new Cube(r, 5);
		int volume = c.volume();
		
		System.out.println("volume of cube : " + volume);
	}

}

class Point
{
	private int x;
	private int y;
	
	Point()
	{
		this.x = 0;
		this.y = 0;
	}
	
	Point(int _x, int _y)
	{
		this.x = _x;
		this.y = _y;
	}
	
	int getX()
	{
		return this.x;
	}
	
	int getY()
	{
		return this.y;
	}
}

class Rectangle
{
	private Point pt1;
	private Point pt2;
	
	Rectangle()
	{
		this.pt1 = new Point();
		this.pt2 = new Point();
	}
	
	Rectangle(int _x1, int _y1, int _x2, int _y2)
	{
		this.pt1 = new Point(_x1, _y1);
		this.pt2 = new Point(_x2, _y2);
	}
	
	Rectangle(Point _pt1, Point _pt2)
	{
		this.pt1 = _pt1;
		this.pt2 = _pt2;
	}
	
	Point getPt1()
	{
		return this.pt1;
	}
	
	Point getPt2()
	{
		return this.pt2;
	}
	
	// 면적 구하기
	int area()
	{
		int xDist = Math.abs(this.pt2.getX() - this.pt1.getX());
		int yDist = Math.abs(this.pt2.getY() - this.pt1.getY());
		
		return xDist * yDist; 
	}
}

class Cube
{
	private Rectangle r;
	int height;
	
	Cube(Rectangle _r, int _height)
	{
		this.r = _r;
		this.height = _height;
	}
	
	int volume()
	{
		int result = this.r.area() * this.height;
		
		return result;
	}
}
