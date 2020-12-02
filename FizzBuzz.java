import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		String[] array = { "1", "2", "3", "5", "8", "30", "15", "12", "7" };
		System.out.println("chose two numbers to be replaced by fizz and buzz,"
				+ " the smallest will be replaced by fizz and the larger will be buzz.");
		System.out.println("enter the number to be fizz");
		Scanner scanner = new Scanner(System.in);
		int f = scanner.nextInt();
		System.out.println("enter the number to be buzz?");
		int b = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < +array.length; i++) {
			int num = Integer.parseInt(array[i]);
			if (num % b == 0 && num % f == 0) {
				array[i] = "fizzbuzz";
			} else if (num % b == 0) {
				array[i] = "buzz";
			} else if (num % f == 0) {
				array[i] = "fizz";
			}
		}
		System.out.println(Arrays.toString(array));
	}
}