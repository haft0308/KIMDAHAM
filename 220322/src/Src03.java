
public class Src03 {

	public static void main(String[] args) {
		
		//	#1
		System.out.println("#1 ==========");
		
		for(int i=2; i<10; i++)
		{
			for(int j=1; j<10; j++)
			{
				System.out.print(i + " * " + j + " = "+ i*j + "\t");
			}
			
			System.out.println();
		}

		//	#2
		System.out.println("#2 ==========");
		
		for(int j=1; j<10; j++)
		{
			for(int i=2; i<10; i++)
			{
				System.out.print(i + " * " + j + " = "+ i*j + "\t");
			}
			
			System.out.println();
		}
		
	}

}
