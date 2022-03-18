import java.util.Scanner;


public class Q_10 {

	public static void main(String[] args) {
		
		float score[] = {0,0,0,0,0};
		float sum=0, avg;
		Scanner sc = new Scanner(System.in);

		System.out.println("국어 점수 입력");
		score[0]=sc.nextFloat();
		sum+=score[0];
		
		System.out.println("영어 점수 입력");
		score[1]=sc.nextFloat();
		sum+=score[1];
		
		System.out.println("수학 점수 입력");
		score[2]=sc.nextFloat();
		sum+=score[2];
		
		System.out.println("과학 점수 입력");
		score[3]=sc.nextFloat();
		sum+=score[3];
		
		System.out.println("음악 점수 입력");
		score[4]=sc.nextFloat();
		sum+=score[4];
		
		avg=sum/5;
		
		System.out.println("sum : "+sum+", avg : "+avg);
		
		
	}

}
