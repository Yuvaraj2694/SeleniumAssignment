package week1.day2;

public class FindDuplicate {

	public static void main(String[] args) {
		int [] Nums = {2, 5, 7, 7, 5, 9, 2, 3};   

		System.out.println("Duplicate Number");  
		for(int i = 0; i < Nums.length; i++) {  
			for(int j = i + 1; j < Nums.length; j++) {  
				if(Nums[i] == Nums[j])  
					System.out.println(Nums[j]);
			}
		}
	}
}
