package example;

public class Src06 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		Product[] p = new Product[3];
		p[0] = new TV();
		p[1] = new Computer();
		p[2] = new Audio();
		
		b.buy(p[0]);
		b.print();
		
		System.out.println("=================");
		
		b.buy(p[1]);
		b.print();
		
		System.out.println("=================");
		
		b.buy(p[2]);
		b.print();

		System.out.println("=================");
		
	}

}

class Product
{
	int price;
	int bonusPoint;
}

class TV extends Product
{
	int channel;
	int volume;
	
	TV()
	{
		price = 100;
		bonusPoint = 100;
	}
}

class Computer extends Product
{
	int cpu;
	int ram;
	
	Computer()
	{
		price = 200;
		bonusPoint = 200;
	}
}

class Audio extends Product
{
	int volume;
	int speaker;
	
	Audio()
	{
		price = 50;
		bonusPoint = 50;
	}
}

class Buyer
{
	int money = 10000;
	int bonusPoint = 0;
	
	void buy(Product _p)
	{
		money -= _p.price;
		bonusPoint += _p.bonusPoint;
	}
	
	void print()
	{
		System.out.println("money : " + this.money);
		System.out.println("bonusPoint : " + this.bonusPoint);
	}
}