package homework;
import java.util.Scanner;

///	15	///

public class Src13 {

	public static void main(String[] args) {
		
		String[] quiz = {"chair�� ����?", "computer�� ����?", "integer�� ����?"};
		String[] answer = {"����", "��ǻ��", "����"};
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		for(int i=0; i<answer.length; i++)
		{
			System.out.print("Q"+ (i+1) + ". " + quiz[i] + " >> ");
			String temp = sc.next();
			
			//	compare with answer
			if(temp.equals(answer[i]))
			{
				System.out.println("�����Դϴ�.");
				count++;
			}
			else
			{
				System.out.println("Ʋ�Ƚ��ϴ�. ������ " + answer[i] + "�Դϴ�.");
			}
		}

		System.out.println("��ü " + quiz.length + "���� ��" + count + "�� ���߼̽��ϴ�.");
		
	}

}
