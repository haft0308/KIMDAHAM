import java.util.Scanner;

public class Q_08 {

	public static void main(String[] args) {
		
		float degC;
		float degF;
		
		System.out.println("input celsius degree");
		Scanner sc = new Scanner(System.in);
		degC = sc.nextFloat();
		degF = 1.8f*degC+32;
		
		System.out.println(degF + "F");
		
	}

}
