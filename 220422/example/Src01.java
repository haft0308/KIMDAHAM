package example;

public class Src01
{
	public static void main(String[] args)
	{
		AnimalAction aa = new AnimalAction();
		Animal ani = new Animal("�Ҷ���");
		Animal dog = new Dog("������");
		Animal cat = new Cat("�����");
		
		aa.action(ani);
		System.out.println("=================");
		aa.action(dog);		
		System.out.println("=================");
		aa.action(cat);
		
	}

}
