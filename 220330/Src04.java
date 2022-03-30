package homework;
import homework.MyArrayMethod;

///	6	///

public class Src04 {

	public static void main(String[] args) {
		
		int[] score = new int[5];
		
		//	input
		score = MyArrayMethod.InputArray(score);
		
		//	sum
		int sum = MyArrayMethod.Sum(score);
		
		//	avg
		float avg = MyArrayMethod.Avg(score);
		
		//	output
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
	}

}
