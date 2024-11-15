import java.util.Scanner;

public class VatTwo {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner(System.in);

        String name;
        int quantity;
        double partialTotal, finalTotal, vatPrice;
        double price = 18000;
        final double vat = 0.12;  
        final double discount = 0.02;

        System.out.print("ENTER PRODUCT NAME: ");
        name = scan.nextLine();
        System.out.print("ENTER QUANTITY: ");
        quantity = scan.nextInt();

        if ( quantity == 10 ) { //dili sure kay manimum ang naka butang
            //price = price - (price * discount); //orig price or disscounted price and iprint?
            partialTotal = (price - (price * discount)) * quantity; // price * qty nalang ni kung apilon nang naa sa taas nga line^^
            vatPrice = partialTotal * vat;
            finalTotal = vatPrice + partialTotal;
            System.out.println("---------------------------------");
            System.out.println("PRODUCT NAME:          " + name);
            System.out.println("QUANTITY:              " + quantity);
            System.out.printf("UNIT PRICE:            %,.2f\n", price);
            System.out.println("DISCOUNT:              2%"); //percent or ang discount na sa value?
            System.out.printf("TOTAL SALES:           %,.2f\n", partialTotal);
            System.out.printf("VATABLE SALES:         %,.2f\n", finalTotal);
            System.out.printf("VAT:                   %,.2f\n", vatPrice); //vat percent or ang vat value sa total?
        } else if ( quantity < 10 ) { //dili sure kay manimum ang naka butang
            partialTotal = price * quantity;
            vatPrice = partialTotal * vat;
            finalTotal = vatPrice + partialTotal;
            System.out.println("---------------------------------");
            System.out.println("PRODUCT NAME:          " + name);
            System.out.println("QUANTITY:              " + quantity);
            System.out.printf("UNIT PRICE:            %,.2f\n", price); //discounted price na ang ibutang or dili?
            System.out.println("DISCOUNT:              N/A"); //percent or ang discount na sa value?
            System.out.printf("TOTAL SALES:           %,.2f\n", partialTotal);
            System.out.printf("VATABLE SALES:         %,.2f\n", finalTotal);
            System.out.printf("VAT:                   %,.2f\n", vatPrice); //vat percent or ang vat value sa total?
        } else{
            System.out.println("MAXIMUM OF 10 UNITS ONLY"); //"manimum" ang naka butang sa papel. Dili ko sure kung maximum or minimum
        }
    }
}