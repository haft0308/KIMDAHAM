package example;

public class AnimalAction
{
	void action(Animal _ani)
	{
		_ani.cry();
		
		if(_ani instanceof Dog)
		{
			((Dog)_ani).run();
		}
		else if(_ani instanceof Cat)
		{
			((Cat)_ani).grooming();
		}
		else
		{
			
		}
		
		
	}
}
