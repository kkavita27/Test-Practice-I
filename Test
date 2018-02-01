import java.util.Scanner;

public class Test {

	public static String stringInput;
	public static int integerInput;
	public static String reverse = "";
	public static Scanner sc;
	public static int inputLength;
	public static String inputType;
	public static int integerReverse;
	public static int sum;

	public static void inputType() {
		System.out.println("what you wish to palindrome string or interger");
		System.out.println("For string press 1 and for integer press 2");
		sc = new Scanner(System.in);
		inputType = sc.nextLine();

		if (inputType.equals("1")) {
			stringPalindrome();
		} else if (inputType.equals("2")) {
			integerPalindrome();
		}
	}

	public static void integerPalindrome() {
		System.out.println("Enter your integer");
		integerInput = sc.nextInt();
		int num = integerInput;

		while (num > 0 && num != 0) {
			int last_digit = num % 10;
			integerReverse = integerReverse * 10 + last_digit;
			num /= 10;
		}

		if (integerInput == integerReverse) {
			System.out.println("Given number is palidrome");
		} else {
			System.out.println("Its not palindrome!");
		}

	}

	public static void stringPalindrome() {
		System.out.println("Enter your string");
		stringInput = sc.next();
		inputLength = stringInput.length();

		for (int i = inputLength - 1; i >= 0; i--) {
			reverse = reverse + stringInput.charAt(i);
		}

		System.out.println("Reverse is " + reverse);

		if (stringInput.equals(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

	public static void main(String[] args) {
		inputType();

	}
}
