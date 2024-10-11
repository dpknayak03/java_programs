package Loops;
import java.util.Scanner;
public class Letters
{
     public static void main(String[] args) 
     {  
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        for(int i=0; i<name.length(); i++)
        {
          System.out.print(name.charAt(i)+" | ");
        }
       // System.out.println(name);

     }   
}
