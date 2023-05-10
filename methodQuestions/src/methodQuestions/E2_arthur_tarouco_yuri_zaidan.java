//Arthur Tarouco e Yuri Zaidan

package methodQuestions;
import java.util.Scanner;

public class E2_arthur_tarouco_yuri_zaidan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberA, numberB;
		numberA=readPositiveInt();
		numberB=readPositiveInt();
		System.out.println("Sum of odd numbers is: "+OddNumberSum(numberA, numberB));
		System.out.println("Amount of even numbers is: "+EvenNumberAmount(numberA, numberB));
		System.out.println("Mean of prime number is: "+PrimeNumberMean(numberA, numberB));
	}

	public static int OddNumberSum (int numberA, int numberB) {
		int oddnumbersum=0;
		for (int count=numberA; count<=numberB;count++) {
			if (count%2!=0) {
			oddnumbersum=oddnumbersum+count;
			}
		}
		return oddnumbersum;
	}
	
	public static int EvenNumberAmount (int numberA, int numberB) {
		int evennumbersum=0;
		for (int count=numberA; count<=numberB;count++) {
			if (count%2==0) {
				evennumbersum++;
			}
		}
		return evennumbersum;
	}
	
	public static int PrimeNumberMean (int numberA, int numberB) {
		int primenumbersum=0;
		int primenumberamount=0;
		for (int count=numberA; count<=numberB;count++) {
			for (int count2=2;count2<=count;count2++) {
				if (count%count2==0) {
					primenumbersum=primenumbersum+count2;
				}
			if (primenumbersum==count)
			primenumberamount++;
			}
		}
		return (primenumbersum/primenumberamount);
	}
	
	public static int readPositiveInt() {
		Scanner keyboard = new Scanner (System.in);
		int number_Validation, number_PosInt=0;
		System.out.println("Enter a positive integer number: ");
		number_PosInt = keyboard.nextInt();
		number_Validation = Integer.signum(number_PosInt);
		while (number_Validation==-1) {
			System.out.println(" You didn't enter a valid number. Please enter a positive integer value: ");
			number_PosInt = keyboard.nextInt();
			number_Validation = Integer.signum(number_PosInt);
			}
		return number_PosInt;
}
}

