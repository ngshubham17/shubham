package largestOne;

import java.util.Scanner;

public class ElderOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int x = sc.nextInt();
		if(x>=18)
		{
			System.out.println("You are elder");
		}
		else
		{
			System.out.println("You are not elder");
		}
	}

}
