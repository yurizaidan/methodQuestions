package methodQuestions;

import java.util.Scanner;

public class divisorsCount {

	public static void main(String[] args) {
		int numberPosInt=0;
		numberPosInt = readPositiveInt();
		printDivisors(numberPosInt);
		countDivisors(numberPosInt);
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
public static void  printDivisors (int num_Int) {
	for (int count=1;count<=num_Int;count++) {
		if (num_Int%count==0) {
			System.out.println("The next is divisor of "+num_Int+": "+count);
			}
		}
	}
public static void countDivisors (int num_Int) {
	int sum_Divisors=0;
	for (int count=1;count<=num_Int;count++) {
		if (num_Int%count==0) {
			sum_Divisors++;
			}
		}
	System.out.println("The amount of divisors is: "+sum_Divisors);
	}
}
