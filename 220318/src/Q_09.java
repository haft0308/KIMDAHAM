
import java.util.Scanner;

public class Q_09 {

	public static void main(String[] args) {
		
		float width;
		float height;
		float area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input width");
		width = sc.nextFloat();
		
		System.out.println("input height");
		height = sc.nextFloat();
		
		area = (width*height)/2;
		System.out.println("area of triangle : " + area);
		
	}

}
