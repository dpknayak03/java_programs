package Loops;
import java.util.Scanner;
public class FibbonacciWhile 
{
    
        public static void main(String[] args) 
        {  
            int n, first = 0, second = 1;

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your number : ");
            n=sc.nextInt(); 
            System.out.println("Fibonacci Series up to " + n );
    
            int i = 1;
            while (i <= n) {
                System.out.print(first + " ");
    
                int nextTerm = first + second;
                first = second;
                second = nextTerm;
    
                i++;
            }
        }
 }
    

