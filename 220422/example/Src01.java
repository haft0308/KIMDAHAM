package example;

public class Src01
{
	public static void main(String[] args)
	{
		AnimalAction aa = new AnimalAction();
		Animal ani = new Animal("º“∂À¿Ã");
		Animal dog = new Dog("∞≥∂À¿Ã");
		Animal cat = new Cat("¡„∂À¿Ã");
		
		aa.action(ani);
		System.out.println("=================");
		aa.action(dog);		
		System.out.println("=================");
		aa.action(cat);
		
	}

}
