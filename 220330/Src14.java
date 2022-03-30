package homework;
import homework.MyArrayMethod;
import java.util.Scanner;

///	16	///

public class Src14 {

	public static void main(String[] args) {
		
		String[] answer = {"television", "computer", "mouse", "phone"};
		Scanner sc = new Scanner(System.in);
		
		//	loop
		for(int i=0; i<answer.length; i++)
		{
			char[] tempArr = answer[i].toCharArray();
			
			//	swap
			for(int j=0; j<answer[i].length(); j++)
			{
				int index1 = (int)(Math.random()*answer[i].length());
				int index2 = (int)(Math.random()*answer[i].length());
				char tempChar;
				
				tempChar = tempArr[index1];
				tempArr[index1] = tempArr[index2];
				tempArr[index2] = tempChar;
			}

			//	convert to string
			String tempStr = new String(tempArr);

			//	ask
			System.out.print("Q" + (i+1) + ". " + tempStr + " >> ");
			String temp = sc.next();
			
			//	compare to answer
			if(temp.equals(answer[i]))
			{
				System.out.println("맞았습니다.");
			}
			else
			{
				System.out.println("틀렸습니다.");
			}
		}

	}

}
