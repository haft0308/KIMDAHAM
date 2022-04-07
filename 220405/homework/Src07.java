package homework;
import java.util.Scanner;

public class Src07 {

	//	book
	static void bookSeat(int[] _arr, int _seatNo)
	{		
		//	out of range
		_seatNo--;
		
		if(_seatNo > _arr.length-1 || _seatNo < 0)
		{
			System.out.println("\"unable to book this seat. please retry.\"");
			System.out.println("");
			return;
		}
		
		//	booked
		if(_arr[_seatNo] == 1)
		{
			System.out.println("\"unable to book this seat. please retry.\"");
		}
		//	unbooked
		else if(_arr[_seatNo] == 0)
		{
			_arr[_seatNo] = 1;
			System.out.println("\"successfully booked your seat.\"");
		}
		
		System.out.println("");
	}
	
	//	print seats
	//	return false, if there's no more seat available
	static boolean printSeat(int[] _arr)
	{
		boolean flag = false;
		
		System.out.println("seat number -");
		for(int i=0; i<_arr.length; i++)
		{
			System.out.print((i + 1) + "\t");
		}
		System.out.println();
		
		System.out.println("available -");
		for(int i=0; i<_arr.length; i++)
		{
			//	booked
			if(_arr[i] == 1)
			{
				System.out.print("X\t");
			}
			//	unbooked
			else if(_arr[i] == 0)
			{
				System.out.print("O\t");
				flag = true;
			}
		}
		System.out.println();
		
		return flag;
	}
	
	//	create array full of 0, and return
	static int[] createSeat(int _max)
	{
		int[] seat = new int[_max];
		
		for(int i=0; i<_max; i++)
		{
			seat[i] = 0;
		}
		
		return seat;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] seat = createSeat(10);
		int tempSeatNo;
		
		while(true)
		{
			//	print
			boolean flag = printSeat(seat);
			if(flag == false)
			{
				System.out.println("\"there's no more seat. book system has quit\"");
				break;
			}
			
			//	input seat number
			System.out.print("choose your seat >> ");
			tempSeatNo = sc.nextInt();
			if(tempSeatNo == -1)
			{
				System.out.println("\"input -1, book system has quit\"");
				break;
			}
			
			//	book
			bookSeat(seat, tempSeatNo);
		}
		

	}

}
