import java.util.Scanner;

public class VatOne {
	public static void main ( String[] args ) {
		Scanner scan = new Scanner(System.in);

		String name;
		int quantity;
		int money;
		double price;
		double change;
		//double vatP;
		double total;

		System.out.print("ENTER NAME OF PRODUCT ");
		name = scan.nextLine();
		System.out.print("ENTER QUANTITY: ");
		quantity = scan.nextInt();
		System.out.print("ENTER PRICE: ");
		price = scan.nextDouble();
		System.out.print("ENTER MONEY: ");
		money = scan.nextInt();

		//vatP = ((price * quantity) * 0.12);
		total = (price * quantity) + ((price * quantity) * 0.12);
		change = money - total;
		System.out.println(name + "'S TOTAL PRICE IS " + total + " AND YOUR CHANGE IS " + change);
	}		
}