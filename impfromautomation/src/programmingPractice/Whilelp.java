package programmingPractice;

public class Whilelp {

	public static void main(String[] args) {
		int i=1;
		while(i<=10)
		{
			int j=10;
			while(j>i)
			{
				System.out.print(" ");
				j--;
			}
			int k=1;
			while(k<(2*i))
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
	}

}
