package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String name = "TestLeaf";

		char[] CharArray = name.toCharArray();

		for (int i=CharArray.length-1;i>=0;i--)
		{
			System.out.println(CharArray[i]);
		}
	}

}