package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week 1";
		String[] array = text.split(" ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					array[j] = " ";
				}
			}
		}
		for (int k = 0; k < array.length; k++) {
			if (array[k] != " ") {
				System.out.print(array[k] + " ");
			}
		}
	}

}
