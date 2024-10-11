package Functions;
import java.util.Scanner;

public class Function 
{
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your name : ");
         String name=sc.next();
         printlNameCharacters( name) ;
         printNameLenght( name) ;
         sc.close();          
    }
    private static void printNameLenght(String name)
    {
        System.out.println(name.length());
    }
    private static void printlNameCharacters(String name)
    {   for(int i=0; i<name.length(); i++)
        {
        System.out.println(name.charAt(i));
        }
    }
}
