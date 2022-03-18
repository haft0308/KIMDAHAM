import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		
		System.out.printf("input a lower character : ");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		char value2 = (char)(value+32);
		
		System.out.println("upper character : "+value2);
	
	}

}
