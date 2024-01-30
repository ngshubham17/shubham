package largestOne;



public class ComputerHouseVisit {

	public static void main(String[] args) {
		int i=1;
		int j = 2 ;
		for(;i<=10; i++ )
		{
			for(j=2; j<i; j++)
			{
				if(j%2==0)
				{
					System.out.println(j);
				}	break;
			}
				
		}
		if(i==j)
		{
			System.out.println(i);
		}
	}

}
