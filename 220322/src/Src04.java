import java.util.Scanner;

public class Src04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true)
		{
			System.out.print("input number(1~10) >> ");
			input = sc.nextInt();
			
			if(input == 0)
			{
				System.out.println("EXIT : input 0");
				break;
			}
		}
	}
}
