package programmingPractice;

import java.util.Scanner;

public class armstrongwhile {

	public static void main(String[] args) {
		int n,r,arm=0;
		System.out.println("enter no");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		int c=n;
		while(n>0)     //1st time //153%10==3  //2nd time   //15%10==5
		{
			    r= n%10;           //153%10==3 so r=3
			    arm=(r*r*r)+arm;   //3*3*3=27+0==27 
			    n=n/10;            //153/10==15
		}
		if(c==arm)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("random");
		}
	}

}
