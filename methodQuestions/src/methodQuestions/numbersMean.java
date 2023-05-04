package methodQuestions;
import java.util.Scanner;
public class numbersMean {

	public static void main(String[] args) {
		double numberA, numberB, numberC;
		numberA=numberB=numberC=0;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Entender number 1/3: ");
		numberA = keyboard.nextDouble();
		System.out.println("Entender number 2/3: ");
		numberB = keyboard.nextDouble();
		System.out.println("Entender number 3/3: ");
		numberC = keyboard.nextDouble();
		System.out.println("Mean is: "+nMean(numberA, numberB, numberC));

	}
	public static double nMean (double n1, double n2, double n3) {
		return ((n1+n2+n3)/3);
	}

}
