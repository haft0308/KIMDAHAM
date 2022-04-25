package example;
import java.util.Scanner;

public class Src03 {

	public static void main(String[] args) {
		
		Game g = new Game();
		
		//	character select loop
		g.genChar();
		
		//	main game loop
		boolean flag = true;
		while(flag)
		{
			flag = g.mainMenu();
		}
	}
}

class Game
{
	Scanner sc;
	private Character character;
	int choice;
		
	Game()
	{
		sc = new Scanner(System.in);
	}
	
	void genChar()
	{
		System.out.println();
		System.out.print("캐릭터를 고르세요.\n  1. 피카츄\n  2. 꼬부기\n  3. 이상해씨\n  >> ");
		this.choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			character = new Pikachu();
			break;
		case 2:
			character = new Squirtle();
			break;
		case 3:
			character = new Bulbasaur();
			break;
		default:
			System.out.println();
			System.out.println("  올바른 숫자(1~3)를 입력하세요.");
			genChar();
			break;
		}
	}
	
	boolean mainMenu()
	{
		boolean flag = true;
		
		System.out.println();
		System.out.print("행동을 선택하세요.\n  0. 스탯 확인\n  1. 밥주기\n  2. 재우기\n  3. 놀아주기\n  4. 훈련시키기\n  5. 종료\n  >> ");
		this.choice = sc.nextInt();
		
		switch(choice)
		{
		case 0:
			character.print();
			break;
		case 1:
			character.eat();
			break;
		case 2:
			character.sleep();
			break;
		case 3:
			character.play();
			flag = character.statCheck();
			character.lvlUpCheck();
			break;
		case 4:
			character.train();
			flag = character.statCheck();
			character.lvlUpCheck();
			break;
		case 5:
			flag = false;
			break;
		default:
			System.out.println();
			System.out.println("  올바른 숫자(0~5)를 입력하세요.");
			mainMenu();
			break;
		}
		
		return flag;
	}
}

abstract class Character
{
	protected int hp;
	protected int energy;
	protected int lvl;
	protected int exp;
	
	protected int maxHp;
	protected int maxEnergy;
	protected int maxExp;
	
	void print()
	{
		System.out.println();
		System.out.println("  hp : " + this.hp + "/" + this.maxHp);
		System.out.println("  energy : " + this.energy + "/" + this.maxEnergy);
		System.out.println("  level(exp) : " + this.lvl + "(" + this.exp + "/" + this.maxExp + ")");
	}
	
	void eat()
	{
		this.hp += 10;
		
		if(this.hp >= this.maxHp)
		{
			this.hp = this.maxHp;
			System.out.println();
			System.out.println("  배가 꽉 찼습니다.");
		}
		else
		{
			System.out.println();
			System.out.println("  밥을 맛있게 먹었습니다.");
		}
	}
	
	void sleep()
	{
		this.energy += 10;
		
		if(this.energy >= this.maxEnergy)
		{
			this.energy = this.maxEnergy;
			System.out.println();
			System.out.println(" 잠을 충분히 잤습니다.");
		}
		else
		{
			System.out.println();
			System.out.println(" 잠을 잘 잤습니다.");
		}
	}

	void play()
	{
		this.hp -= 10;
		this.energy -= 10;
		
		this.exp += 5;
	}
	
	void train()
	{
		this.hp -= 20;
		this.energy -= 30;
		
		this.exp += 10;
	}
	
	void lvlUpCheck()
	{
		if(this.exp >= this.maxExp)
		{
			this.exp -= this.maxExp;
			this.lvl++;
			System.out.println();
			System.out.println("  레벨 업!");
		}
	}
	
	boolean statCheck()
	{
		boolean flag = true;
		
		if(this.hp <= 0)
		{
			System.out.println();
			System.out.println("  생명력이 너무 낮아 죽었습니다!");
			flag = false;
			return flag;
		}
		else if(this.energy <= 0)
		{
			System.out.println();
			System.out.println("  지쳐서 기절했습니다!");
			this.energy = 0;
			return flag;
		}
		
		return flag;
	}
}

class Pikachu extends Character
{
	Pikachu()
	{
		this.hp = 50;
		this.energy = 50;
		this.lvl = 0;
		this.exp = 0;
		
		this.maxHp = this.hp;
		this.maxEnergy = this.energy;
		this.maxExp = 100;
	}
}

class Squirtle extends Character
{
	Squirtle()
	{
		this.hp = 40;
		this.energy = 60;
		this.lvl = 0;
		this.exp = 0;
		
		this.maxHp = this.hp;
		this.maxEnergy = this.energy;
		this.maxExp = 80;
	}
}

class Bulbasaur extends Character
{
	Bulbasaur()
	{
		this.hp = 90;
		this.energy = 40;
		this.lvl = 0;
		this.exp = 0;
		
		this.maxHp = this.hp;
		this.maxEnergy = this.energy;
		this.maxExp = 100;
	}
}