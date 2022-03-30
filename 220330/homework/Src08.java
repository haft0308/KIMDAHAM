package homework;
import java.util.Scanner;

///	10	///

public class Src08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] coin = new int[4];
		//	coin[0] = 500 won coin
		//	coin[1] = 100 won coin
		//	coin[2] = 50 won coin
		//	coin[3] = 10 won coin
		
		//	input
		System.out.print("액수 입력 >> ");
		int input = sc.nextInt();
		
		for(int i=0; i<coin.length; i++)
		{
			switch(i)
			{
				case 0:
					coin[i] = input / 500;
					input -= coin[i] * 500;
					break;
					
				case 1:
					coin[i] = input / 100;
					input -= coin[i] * 100;
					break;
					
				case 2:
					coin[i] = input / 50;
					input -= coin[i] * 50;
					break;
					
				case 3:
					coin[i] = input / 10;
					input -= coin[i] * 100;
					break;
			}
		}
		
		System.out.println("500 coin : " + coin[0]);
		System.out.println("100 coin : " + coin[1]);
		System.out.println("50 coin : " + coin[2]);
		System.out.println("10 coin : " + coin[3]);
		
	}

}
