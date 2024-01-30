package programmingPractice;

public class ReversStarTriangle {

	public static void main(String[] args) {
		int line = 10;
		for(int a= line; a>=1; a-- )
		{
			for(int b=line; b>a; b--)
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
