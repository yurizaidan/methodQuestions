package methodQuestions;
import java.util.Scanner;
public class shoppingCart {

	public static void main(String[] args) {
		int productNumber=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many items you'd like to add to the cart?");
		productNumber=keyboard.nextInt();
		System.out.println("Checkout Total Price is: "+checkoutTotalPrice(productNumber));
		}

	public static double readProductPrice() {
		double product_Price=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please inform product retail price in BRL (R$): ");
		product_Price=keyboard.nextDouble();	
		return product_Price;
	}
	public static double checkoutTotalPrice(int product_Number) {
		double sumProductPrice=0;
		double productPrice=0;
		for (int count=0;count<product_Number;count++) {
			productPrice=readProductPrice();
			sumProductPrice=sumProductPrice+productPrice;
		}
	return sumProductPrice;
	}
}
