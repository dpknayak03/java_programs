package Loops;

import java.util.Scanner;

public class MultiplicationtableAll 
{
      public static void main(String[] args) 
    {
        
        Scanner console = new Scanner(System.in);
        int multiplicand, multiplier=1, product;
        int limit;

        System.out.println("Enter any limit for table : ");
        limit = console.nextInt();

        System.out.println("Multiplication taable of : "+ limit);
        while(multiplicand<=limit)
        while(multiplier<=10)
        {
            product= multiplicand*multiplier;
            System.out.println(product);
            multiplier++;
        }
        
    }
}
