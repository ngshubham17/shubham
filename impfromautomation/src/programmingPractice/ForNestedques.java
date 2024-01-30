package programmingPractice;

public class ForNestedques {

	public static void main(String[] args) {
		for(int a = 1; a<=10; a++)
		{
			for(int b=10; b>a; b--)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++)
			{				
					System.out.print("*");		
			}
			for(int d=1; d<a; d++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
