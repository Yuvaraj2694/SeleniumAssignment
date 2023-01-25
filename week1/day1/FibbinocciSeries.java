package week1.day1;

public class FibbinocciSeries {

	public static void main(String[] args) {
		int n = 1, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series " + n + " terms:");

	    for (int i =1; i <=11; ++i) {
	      System.out.print(firstTerm + ", ");
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	}
	}
}