package example;

public class Src06 {

	public static void main(String[] args) {
		
		// Buyer Ŭ������ ��ü ����, �Ҵ�
		Buyer b = new Buyer();
		
		//	Product ��ü �迭 3�ڸ� ����,
		// ����, ��ĳ�������� TV, Computer, Audio ��ü �Ҵ�.
		Product[] p = new Product[3];
		p[0] = new TV();
		p[1] = new Computer();
		p[2] = new Audio();
		
		// p[0] (TV) money, bonusPoint ����
		// ��� ���
		b.buy(p[0]);
		b.print();
		
		System.out.println("=================");
		
		// p[1] (Computer) money, bonusPoint ����
		// ��� ���
		b.buy(p[1]);
		b.print();
		
		System.out.println("=================");
		
		// p[2] (Audio) money, bonusPoint ����
		// ��� ���
		b.buy(p[2]);
		b.print();

		System.out.println("=================");
		
	}

}

// ��� Ŭ����(�θ� Ŭ����) Product
class Product
{
	//	��� Ŭ���� Product�� �������
	int price;
	int bonusPoint;
}

// Product�� �ǻ�� Ŭ����(�ڳ� Ŭ����) TV
class TV extends Product
{
	int channel;
	int volume;
	
	// Ŭ���� TV�� ������
	// ��� ������ �� �ʱ�ȭ
	TV()
	{
		price = 100;
		bonusPoint = 100;
	}
}

// Product�� �ǻ�� Ŭ����(�ڳ� Ŭ����) Computer
class Computer extends Product
{
	int cpu;
	int ram;
	
	// Ŭ���� Computer�� ������
	// ��� ������ �� �ʱ�ȭ
	Computer()
	{
		price = 200;
		bonusPoint = 200;
	}
}

// Product�� �ǻ�� Ŭ����(�ڳ� Ŭ����) Audio
class Audio extends Product
{
	int volume;
	int speaker;

	// Ŭ���� Audio�� ������
	// ��� ������ �� �ʱ�ȭ
	Audio()
	{
		price = 50;
		bonusPoint = 50;
	}
}

// ���� �ŷ�(����)�� ������ Ŭ���� Buyer
class Buyer
{
	int money = 10000;
	int bonusPoint = 0;
	
	// �޼ҵ� buy()
	// Product, �Ǵ� �� �ǻ�� Ŭ������ �Ķ���ͷ� �޾�,
	// �ش� Ŭ������ ������� price, bonusPoint��
	// ���� Buyer�� money, bonusPoint�� ���ų� ���Ͽ� �ٽ� ������.
	void buy(Product _p)
	{
		money -= _p.price;
		bonusPoint += _p.bonusPoint;
	}
	
	// �޼ҵ� print()
	// ���� Buyer ��ü�� ������� money, bonusPoint�� �����.
	void print()
	{
		System.out.println("money : " + this.money);
		System.out.println("bonusPoint : " + this.bonusPoint);
	}
}