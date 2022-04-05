package homework;
import java.util.Scanner;

///	weight, height, shoe size

public class Src05 {

	static int[] getMax(int[][] _arr)
	{
		int[] maxVal = {0, 0, 0};
		
		for(int i=0; i<_arr.length; i++)
		{
			for(int j=0; j<_arr[i].length; j++)
			{
				if(_arr[i][j] > maxVal[j])
				{
					maxVal[j] = _arr[i][j];
				}
			}
		}
		
		return maxVal;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] stud =	new int[10][3];
		int[] maxVal;
		
		//	input
		for(int i=0; i<stud.length; i++)
		{
			System.out.println(i + "번 학생");
			
			for(int j=0; j<stud[i].length; j++)
			{
				if(j == 0)
				{
					System.out.print("몸무게 >> ");
				}
				else if(j == 1)
				{
					System.out.print("키 >> ");
				}
				else if(j == 2)
				{
					System.out.print("신발 사이즈 >> ");
				}
				
				stud[i][j] = sc.nextInt();
			}
		}
		
		//	compare
		maxVal = getMax(stud);
		
		//	print
		for(int i=0; i<maxVal.length; i++)
		{
			System.out.print(maxVal[i] + ", ");
		}
		

	}

}
