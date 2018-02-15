package maven_test.test_data;

import java.util.Scanner;

public class ArraySort {

	public static Scanner sc;
	public static int array1[];

	public static void sortArrayOnce(int array[]) {
		sc = new Scanner(System.in);
		System.out.println("Enter how many numbers you want in array");
		int numberOfInteger = sc.nextInt();

		System.out.println("Enter " + numberOfInteger + " integer");
		array1 = new int[numberOfInteger];
		for (int i = 0; i < numberOfInteger; i++) {
			if (sc.hasNextInt()) {
				array1[i] = sc.nextInt();
			} else {
				System.out.println("You didn't provide enough numbers");
				break;
			}
		}
	}

	public static void sortArray(int arr[]) {
		int n = arr.length;
		// boolean swapped = false;
		int counter = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					counter++;
				}
			}
		}
		if (counter == 1) {
			for (int k = 0; k < n; ++k) {
				System.out.print(arr[k] + " ");
			}
			System.out.println("swapped only once ");
		} else {
			System.out.println("It took more than 1 swap to sort!");
		}
	}

	public static void main(String[] args) {
		sortArrayOnce(array1);
		sortArray(array1);
	}
}
