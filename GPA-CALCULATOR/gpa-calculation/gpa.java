import java.util.Scanner;
public class gpa
{
   public static void main(String [] args) 
   {
       int quiz, midterm, ffinal; //we cannot write "final"
       double average;
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter your quiz score: ");
       quiz = input.nextInt();
       System.out.println("Enter your midterm score: ");
       midterm = input.nextInt();
       System.out.println("Enter your final score: ");
       ffinal = input.nextInt();
       
       average = (quiz * 0.2) + (midterm * 0.35) + (ffinal * 0.45);
       System.out.println("Your GPA is : " + average);
   }
}