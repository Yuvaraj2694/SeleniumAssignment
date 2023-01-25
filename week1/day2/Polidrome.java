package week1.day2;

public class Polidrome {

	public static void main(String[] args) {
		String Name = "madam";
		String rev ="";
		
		char Array [] = Name.toCharArray();
		for (int i= Name.length() -1; i>=0; i--) {
			rev = rev + Array[i];
		}
			if (Name.equals(rev)) {
			System.out.println("it is a palidrome");
		} else {
			System.out.println("it is not a palidrome");
		}
	}
}
