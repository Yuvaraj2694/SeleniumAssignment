package week1.day2;

public class WordCount {

	private static final int i = 0;

	public static void main(String[] args) {
		String str ="Amazon developement Cente Chennai";
		String [] split = str.split(" ");
		int lenght = split.length;
		System.out.println();
		
		for (int i = split.length -1; i>=0; i--);{
			System.out.print(split[i] + " ");
		}
	}
}
