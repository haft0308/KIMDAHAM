package example_03;

public class TV
{
	private String color;
	private boolean power;
	private int channel;
	
	TV()
	{
		this.power = false;
		this.channel = 0;
	}
	
	void setPower()
	{
		if(power == false)
		{
			System.out.println("TV를 켭니다.");
		}
		else if(power == true)
		{
			System.out.println("TV를 끕니다.");
		}
		
		power = !power;
	}
	
	void setChannel(int _chan)
	{
		System.out.println("채널을 " + _chan + "번으로 바꿉니다.");
		this.channel = _chan;
	}
	
	void channelUp()
	{
		System.out.println("채널을 1 올립니다. --> " + ++channel);
	}
	
	void channelDown()
	{
		System.out.println("채널을 1 내립니다. --> " + --channel);
	}
	
	void print()
	{
		System.out.println("전원 : " + this.power + " / 채널 : " + this.channel);
	}
}
