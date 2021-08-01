import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {
		System.out.println("Enter the Number: ");
		int num1 = sc.nextInt();
		int temp1 = num1;
		int revnum = 0;
		int remainder;
		while (num1 > 0) {
			remainder = num1 % 10;
			revnum = revnum * 10 + remainder;
			num1 = num1 / 10;
		}
		if (temp1 == revnum) {
			System.out.println("Given Number " + temp1 + " is Palindrome.");
		} else {
			System.out.println("Given Number " + temp1 + " is Not a Palindrome.");
		}
	}

	// function to printPattern

	public void printPattern() {
		System.out.println("Enter the Number: ");
		int num2 = sc.nextInt();
		System.out.println();
		for (int i = num2; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// function to check no is prime or not

	public void checkPrimeNumber() {

		System.out.println("Enter the Number: ");
		int num3 = sc.nextInt();
		int count = 0;
		int temp;
		for (int i = 2; i <= num3; i++) {
			temp = num3 % i;
			if (temp == 0) {
				count++;
			} else {
				continue;
			}

		}
		if (count > 2) {
			System.out.println("Given Number " + num3 + " is Not Prime.");
		} else {
			System.out.println("Given Number " + num3 + " is Prime.");
		}

	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.

		System.out.println("Enter the Number: ");
		int num4 = sc.nextInt();
		int first = 0, second = 1;
		int NextTerm;
		System.out.println("The Fibonacci Series till " + num4 + " terms is:");
		for (int i = 0; i <= num4; i++) {
			System.out.print(first + ", ");
			NextTerm = first + second;
			first = second;
			second = NextTerm;
		}
		System.out.println();

	}

//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("\nEnter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
