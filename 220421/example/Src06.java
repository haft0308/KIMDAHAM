package example;

public class Src06 {

	public static void main(String[] args) {
		
		// Buyer 클래스의 객체 선언, 할당
		Buyer b = new Buyer();
		
		//	Product 객체 배열 3자리 선언,
		// 이후, 업캐스팅으로 TV, Computer, Audio 객체 할당.
		Product[] p = new Product[3];
		p[0] = new TV();
		p[1] = new Computer();
		p[2] = new Audio();
		
		// p[0] (TV) money, bonusPoint 증감
		// 결과 출력
		b.buy(p[0]);
		b.print();
		
		System.out.println("=================");
		
		// p[1] (Computer) money, bonusPoint 증감
		// 결과 출력
		b.buy(p[1]);
		b.print();
		
		System.out.println("=================");
		
		// p[2] (Audio) money, bonusPoint 증감
		// 결과 출력
		b.buy(p[2]);
		b.print();

		System.out.println("=================");
		
	}

}

// 상속 클래스(부모 클래스) Product
class Product
{
	//	상속 클래스 Product의 멤버변수
	int price;
	int bonusPoint;
}

// Product의 피상속 클래스(자녀 클래스) TV
class TV extends Product
{
	int channel;
	int volume;
	
	// 클래스 TV의 생성자
	// 멤버 변수의 값 초기화
	TV()
	{
		price = 100;
		bonusPoint = 100;
	}
}

// Product의 피상속 클래스(자녀 클래스) Computer
class Computer extends Product
{
	int cpu;
	int ram;
	
	// 클래스 Computer의 생성자
	// 멤버 변수의 값 초기화
	Computer()
	{
		price = 200;
		bonusPoint = 200;
	}
}

// Product의 피상속 클래스(자녀 클래스) Audio
class Audio extends Product
{
	int volume;
	int speaker;

	// 클래스 Audio의 생성자
	// 멤버 변수의 값 초기화
	Audio()
	{
		price = 50;
		bonusPoint = 50;
	}
}

// 실제 거래(연산)를 진행할 클래스 Buyer
class Buyer
{
	int money = 10000;
	int bonusPoint = 0;
	
	// 메소드 buy()
	// Product, 또는 그 피상속 클래스를 파라미터로 받아,
	// 해당 클래스의 멤버변수 price, bonusPoint를
	// 각각 Buyer의 money, bonusPoint에 빼거나 더하여 다시 저장함.
	void buy(Product _p)
	{
		money -= _p.price;
		bonusPoint += _p.bonusPoint;
	}
	
	// 메소드 print()
	// 현재 Buyer 객체의 멤버변수 money, bonusPoint를 출력함.
	void print()
	{
		System.out.println("money : " + this.money);
		System.out.println("bonusPoint : " + this.bonusPoint);
	}
}