package week1.day2;

class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name = "testleaf";
		for (int i= Name.length() -1; i>=0; i--) {
			char Array [] = Name.toCharArray();
			System.out.println(Array[i]);
		}
	}
}
