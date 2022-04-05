package homework;
import java.util.Scanner;

///	volume of cylinder

public class Src06 {

	static double volCylinder()
	{
		Scanner sc = new Scanner(System.in);
		int radius;
		int height; 
		double volume;
		
		System.out.print("radius >> ");
		radius = sc.nextInt();
		
		System.out.print("height >> ");
		height = sc.nextInt();
		
		volume = Math.PI * Math.pow(radius, 2) * height;
		
		return volume;
	}
	
	public static void main(String[] args) {
		
		double vol = volCylinder();
		
		System.out.printf("volume of the cylinder : %.1f", vol);

	}

}
