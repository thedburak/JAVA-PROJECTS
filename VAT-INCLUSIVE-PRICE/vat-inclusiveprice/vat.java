import java.util.Scanner;
public class vat {
    public static void main(String [] args) 
    {
        double vatInclusivePrice, price, vat = 0.18;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of the product: ");
        price = input.nextDouble();
        vatInclusivePrice = price + (price * vat);
        System.out.println(vatInclusivePrice);
    }
}