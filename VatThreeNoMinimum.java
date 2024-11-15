import java.util.Scanner;

public class VatThreeNoMinimum {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner(System.in);

        String name;
        int quantity;
        double partialTotal, finalTotal, vatPrice, revenue = 0, totalSales = 0;
        final double miscFee = 5000;
        final double discount = 0.1;
        double price = 25000;
        final double inciFee = 2000;   
        final double vat = 0.12;

        for ( int x = 0; x < 3; x++ ) {
            if ( x == 0 ) {
                System.out.print("ENTER PRODUCT NAME: ");
                name = scan.nextLine();
                System.out.print("ENTER QUANTITY: ");
                quantity = scan.nextInt();
                
                if ( quantity< 500 ) { //no discount
                    partialTotal = price * quantity;
                    vatPrice = partialTotal * vat;
                    finalTotal = partialTotal + vatPrice;
                } else { //with discount
                    price = price - (price * discount);
                    partialTotal = price * quantity;
                    vatPrice = partialTotal * vat;
                    finalTotal = partialTotal + vatPrice;
                }
                    System.out.println("PRODUCT NAME:      " + name);
                    System.out.println("QUANTITY:          " + quantity);
                    System.out.printf("PRICE:             %,.2f\n",price);
                
                if ( quantity < 500 ) { //no discount
                    System.out.println("DISCOUNT:          N/A"); 
                } else { //with discount
                    System.out.println("DISCOUNT:          10%"); 
                }
                    System.out.printf("TOTAL SALES:       %,.2f\n",partialTotal);
                    System.out.printf("VATABLE SALES:     %,.2f\n",finalTotal);
                    System.out.printf("VAT:               %,.2f\n",vatPrice);
                    System.out.println("----------------------------------");
                    totalSales += finalTotal;
            }   
            if ( x == 1 ) {
                System.out.print("ENTER PRODUCT NAME: ");
                name = scan.nextLine();
                System.out.print("ENTER QUANTITY: ");
                quantity = scan.nextInt();
                if ( quantity < 500 ) { //no discount
                    partialTotal = price * quantity;
                    vatPrice = partialTotal * vat;
                    finalTotal = partialTotal + vatPrice;
                } else {  //with discount
                    price = price - (price * discount);
                    partialTotal = price * quantity;
                    vatPrice = partialTotal * vat;
                    finalTotal = partialTotal + vatPrice;
                }
                    System.out.println("PRODUCT NAME:      " + name);
                    System.out.println("QUANTITY:          " + quantity);
                    System.out.printf("PRICE:             %,.2f\n",price);
                
                if ( quantity < 500 ) { //no discount
                    System.out.println("DISCOUNT:          N/A"); 
                } else { //with discount
                    System.out.println("DISCOUNT:          10%"); 
                }
                    System.out.printf("TOTAL SALES:       %,.2f\n",partialTotal);
                    System.out.printf("VATABLE SALES:     %,.2f\n",finalTotal);
                    System.out.printf("VAT:               %,.2f\n",vatPrice);
                    System.out.println("----------------------------------");
                    totalSales += finalTotal;
            }    
            if ( x == 2 ) {
                System.out.print("ENTER PRODUCT NAME: ");
                name = scan.nextLine();
                System.out.print("ENTER QUANTITY: ");
                quantity = scan.nextInt();
                if ( quantity < 500 ) { //no discount
                    partialTotal = price * quantity;
                    vatPrice = partialTotal* vat;
                    finalTotal = partialTotal + vatPrice;
                } else { //with discount
                    price = price - (price * discount);
                    partialTotal = price * quantity;
                    vatPrice = partialTotal * vat;
                    finalTotal = partialTotal + vatPrice;
                }
                    System.out.println("PRODUCT NAME:      " + name);
                    System.out.println("QUANTITY:          " + quantity);
                    System.out.printf("PRICE:             %,.2f\n",price);
                
                if ( quantity < 500 ) { //no discount
                    System.out.println("DISCOUNT:          N/A"); 
                } else { //with discount
                    System.out.println("DISCOUNT:          10%"); 
                }
                    System.out.printf("TOTAL SALES:       %,.2f\n",partialTotal);
                    System.out.printf("VATABLE SALES:     %,.2f\n",finalTotal);
                    System.out.printf("VAT:               %,.2f\n",vatPrice);
                    System.out.println("----------------------------------");
                    totalSales += finalTotal;
            }    
            scan.nextLine(); 
        }
        revenue = totalSales - (miscFee + inciFee); //sa annual revenue daw magminus sa incidental fee ang naka butang sa papel. Dili ko sure kung monthly or annual ba jud
        System.out.printf("TOTAL SALES:       %,.2f\n",totalSales);
        System.out.printf("TOTAL REVENUE:     %,.2f",revenue);
    }
}