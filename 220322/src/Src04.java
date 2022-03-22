import java.util.Scanner;

public class Src04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		int count = 0;
		
		while(true)
		{
			//	input
			System.out.print("input number(1~10) >> ");
			input = sc.nextInt();
			
			//	print "count"
			if(input == 0)
			{
				System.out.println("EXIT : " + count + "time(s) input");
				break;
			}
			
			count++;
		}
	}
}
