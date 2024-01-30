package programmingPractice;

import java.util.Scanner;

public class Armstrong {
	
	//public int number()
	//{
		//int x=0,y=0,z=0;
		//System.out.println("armstrong no loading...");
		//return(z);
	//}

	public static void main(String[] args) {
		//Armstrong n = new Armstrong();
		int a,r,s=0,c;
		System.out.println("enter number");
		Scanner sc= new Scanner(System.in);
		 a= sc.nextInt();
		 c=a;
		for(; a>0; a++)
		{
			r=a%10;
			s=(r*r*r)+s;
			a=a/10;
		} 
		if(c==s)
		{
			System.out.println("no is armstrong");
		}
		else
		{
			System.out.println("no is not armstrong");
		}
	}

}
