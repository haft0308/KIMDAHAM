package homework;
import java.util.Scanner;

///	15	///

public class Src13 {

	public static void main(String[] args) {
		
		String[] quiz = {"chair의 뜻은?", "computer의 뜻은?", "integer의 뜻은?"};
		String[] answer = {"의자", "컴퓨터", "정수"};
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		for(int i=0; i<answer.length; i++)
		{
			System.out.print("Q"+ (i+1) + ". " + quiz[i] + " >> ");
			String temp = sc.next();
			
			//	compare with answer
			if(temp.equals(answer[i]))
			{
				System.out.println("정답입니다.");
				count++;
			}
			else
			{
				System.out.println("틀렸습니다. 정답은 " + answer[i] + "입니다.");
			}
		}

		System.out.println("전체 " + quiz.length + "문제 중" + count + "개 맞추셨습니다.");
		
	}

}
