import java.util.Scanner;

public class VatFour {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );

        String name;
        int quantity;
        double partialTotal, finalTotal, vatPrice;
        final double discount = 0.01;
        double price = 2;
        final double vat = 0.12;

        System.out.print("ENTER CANDY NAME: ");
        name = scan.nextLine();
        System.out.print("ENTER QUANTITY: ");
        quantity = scan.nextInt();

        if ( quantity != 20 ) {
            partialTotal = price * quantity;
            vatPrice = partialTotal * vat;
            finalTotal = partialTotal + vatPrice;
        } else {
            price = price - (price * discount);
            partialTotal = price * quantity;
            vatPrice = partialTotal * vat;
            finalTotal = partialTotal + vatPrice;
        }
            System.out.println("---------------------------------");
            System.out.println("PRODUCT NAME:          " + name);
            System.out.println("QUANTITY:              " + quantity);
            System.out.printf("PRICE:                 %,.2f\n", price); 

        if ( quantity != 20 ) {
            System.out.println("DISCOUNT:              N/A"); 
        } else {
            System.out.println("DISCOUNT:              1%"); 
        }
            System.out.printf("MASTER SALES:           %,.2f\n", partialTotal);
            System.out.printf("VATABLE SALES:         %,.2f\n", finalTotal);
            System.out.printf("VAT:                   %,.2f\n", vatPrice); 
    }
}