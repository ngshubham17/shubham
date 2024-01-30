package programmingPractice;

public class Starright {
	public static void main(String[] args) {
		int line=10;
	
	for(int i=line; i>=1; i--)
	{
		for(int j=line; j>=i; j--)
		{
			System.out.print(" ");
		}
 		for(int k=1; k<=(2*i); k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}

