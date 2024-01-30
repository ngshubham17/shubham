package programmingPractice;

public class Star1 {

	public static void main(String[] args) {
		
		for(int c=1; c<=10; c++)
		{		
		for(int b=10; b>=c; b--)
		{
			System.out.print("  ");
		}
		for(int a=1; a<=(3*c-5); a++)
		{
			System.out.print("*");
		}
		  System.out.println();
		}
	}

}
