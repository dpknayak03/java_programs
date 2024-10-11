package Loops;
import java.util.Scanner;
public class MultiplicationTable 
{
    public static void main(String[] args) 
    {
        ;
        Scanner console = new Scanner(System.in);
        int multiplicand, multiplier=1, product;

        System.out.println("Enter any positive integer : ");
        multiplicand = console.nextInt();

        System.out.println("Multiplication taable of : "+ multiplicand);
        
        while(multiplier<=10)
        {
            product= multiplicand*multiplier;
            System.out.println(product);
            multiplier++;
        }
        
    }
}
