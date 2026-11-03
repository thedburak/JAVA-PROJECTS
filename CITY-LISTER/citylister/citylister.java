import java.util.Scanner;
import java.util.Arrays;
public class citylister
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String[] cities = new String[5];
        
        for (int i = 0; i < cities.length; i++) {
            System.out.print("City " + (i+1) + ": ");
            cities[i] = input.nextLine();
        }
        
        System.out.println("\n---------- YOUR SAVED CITIES ----------\n");
        
        for (String city: cities) {
            System.out.println("--> " + city);
        }
    }
}