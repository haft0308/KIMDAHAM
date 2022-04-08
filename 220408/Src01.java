package example_03;
import example_03.TV;

public class Src01
{
	public static void main(String[] args)
	{
		TV[] tv = new TV[3];
		
		for(int i=0; i<tv.length; i++)
		{
			tv[i] = new TV();
			tv[i].setPower();
			tv[i].setChannel(7);
		}
	}
}
