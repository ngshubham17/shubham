package largestOne;

public class LeapYear {

	public static void main(String[] args) {
		int year = 1800;
		
			if(year%4==0)
			{
				if(year%100!=0)
				{
					System.out.println("leap year");
				}
				else
				{
					System.out.println("not");
				}
			}
			else
			{
				if(year%400==0)
				{
					System.out.println("leap year");
				}
				else
				{
					System.out.println("not");
				}
			}
			
	}

}
