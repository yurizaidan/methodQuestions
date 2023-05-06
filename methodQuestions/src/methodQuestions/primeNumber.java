package methodQuestions;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberPosInt=0;
		numberPosInt=readPositiveInt();
		primeNumber(numberPosInt);
	}
	public static int readPositiveInt() {
		Scanner keyboard = new Scanner (System.in);
		int number_Validation, number_PosInt=0;
		System.out.println("Enter a positive integer number: ");
		number_PosInt = keyboard.nextInt();
		number_Validation = Integer.signum(number_PosInt);
		while (number_Validation==-1) {
			System.out.println(" You didn't a valid number. Please enter a positive integer value: ");
			number_PosInt = keyboard.nextInt();
			number_Validation = Integer.signum(number_PosInt);
			}
		return number_PosInt;
		}
	public static void primeNumber (int number_PosInt) {
		int sum=0;
		for (int count=2;count<=number_PosInt;count++) {
			if (number_PosInt%count==0) {
				sum=sum+count;
			}
		}
		if (sum==0) {
			System.out.println("Not a prime number.");
		}
		else if (sum==number_PosInt) {
			System.out.println("Prime number.");
			}
		else {
			System.out.println("Not a prime number.");
		}
	}
}
