package week1.day2;

public class StringClass {

	public static void main(String[] args) {
		String Name ="testleaf"; 
		for (int i= Name.length() -1; i>=0; i--) {
			char Array [] = Name.toCharArray();
			System.out.println(Array[i]);
		}
}
}