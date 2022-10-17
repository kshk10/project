package arrayPackage;

public class ArrayUsingBreak {

	public static void main(String[] args) {
		boolean isExist = false;
		int array[] = { 1, 2, 4, 4, 5, 6 };
		int findnumber = 4;
		for (int i = 0; i < array.length; i++) {
			if (findnumber == array[i]) {
				isExist = true;
				break;
			}
		}
		if (isExist == true)
		{
			System.out.println("The number is present in array");
		} else {
			System.out.println("The number is not present in array");
		}
	}
}