import java.util.Scanner;

public class VatThree {
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
                System.out.print("ENTER NAME: ");
                name = scan.nextLine();
                System.out.print("ENTER QUANTITY: ");
                quantity = scan.nextInt();
                if ( quantity >= 500 ) {
                    if ( x == 0 ) {
                        price = price - (price * discount);
                        partialTotal = price * quantity;
                        vatPrice = partialTotal * vat;
                        finalTotal = partialTotal + vatPrice;
                        System.out.println("NAME:      " + name);
                        System.out.println("QUANTITY:          " + quantity);
                        System.out.printf("PRICE:             %,.2f\n",price);
                        System.out.println("DISCOUNT:          10%");
                        System.out.printf("TOTAL SALES:       %,.2f\n",partialTotal);
                        System.out.printf("VATABLE SALES:     %,.2f\n",finalTotal);
                        System.out.printf("VAT:               %,.2f\n",vatPrice);
                        System.out.println("----------------------------------");
                        totalSales += finalTotal;                    
                    } else if ( x == 1 ) {
                        price = price - (price * discount);
                        partialTotal = price * quantity;
                        vatPrice = partialTotal * vat;
                        finalTotal = partialTotal + vatPrice;
                        System.out.println("NAME:      " + name);
                        System.out.println("QUANTITY:          " + quantity);
                        System.out.printf("PRICE:             %,.2f\n",price);
                        System.out.println("DISCOUNT:          10%");
                        System.out.printf("TOTAL SALES:       %,.2f\n",partialTotal);
                        System.out.printf("VATABLE SALES:     %,.2f\n",finalTotal);
                        System.out.printf("VAT:               %,.2f\n",vatPrice);
                        System.out.println("----------------------------------");
                        totalSales += finalTotal;                   
                    } else if ( x == 3 ) {
                        price = price - (price * discount);
                        partialTotal = price * quantity;
                        vatPrice = partialTotal * vat;
                        finalTotal = partialTotal + vatPrice;
                        System.out.println("NAME:      " + name);
                        System.out.println("QUANTITY:          " + quantity);
                        System.out.printf("PRICE:             %,.2f\n",price);
                        System.out.println("DISCOUNT          10%");
                        System.out.printf("TOTAL SALES:       %,.2f\n",partialTotal);
                        System.out.printf("VATABLE SALES:     %,.2f\n",finalTotal);
                        System.out.printf("VAT:               %,.2f\n",vatPrice);
                        System.out.println("----------------------------------");
                        totalSales += finalTotal;                    
                    }                
                } else {
                    System.out.println("MINIMUM QUANTITY IS 500.");
                }
                scan.nextLine(); 
        }
        if ( totalSales > 0 ) {
            revenue = totalSales- (miscFee + inciFee); //sa annual revenue daw magminus sa incidental fee ang naka butang sa papel. Dili ko sure kung monthly or annual ba jud
            System.out.printf("TOTAL SALES:       %,.2f\n",totalSales);
            System.out.printf("TOTAL REVENUE:     %,.2f",revenue);
        }        
    }
}