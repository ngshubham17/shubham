package programmingPractice;

public class MarksNavg {
	public static int subWithMarks(){
	int maths = 90;
	int science =70;
	int physics = 80;
	int chemistry = 70;
	int  english = 80;
	int a = maths + science + physics+ chemistry+english;
	return(a);
	}
	public static void main(String[] args) {
		int r = MarksNavg.subWithMarks();
		//System.out.println(r);
		int total = 5;
		System.out.println(r/total);
		
		
	}

}
