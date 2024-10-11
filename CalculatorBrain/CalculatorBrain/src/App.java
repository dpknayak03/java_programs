import java.util.Scanner;

public class App 
{
      public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First input :  ");
        int a=sc.nextInt();
        System.out.print("Enter Second input : ");
        int b=sc.nextInt();
         Addition(a, b);
         Subtraction(a, b);
         Multiplication(a, b);
         Division(a, b);
    }
    public static void Addition(int a,int b)
    {
        int sum=a+b;
        System.out.println("Addition of two numbers is : "+sum);
    }
    public static void Subtraction(int a,int b)
    {
        int sub=a-b;
        System.out.println("Subtraction of two numbers is : "+sub);
    }
    public static void Multiplication(int a,int b)
    {
        int mul=a*b;
        System.out.println("Multiplication of two numbers is : "+mul);
    }
    public static void Division(int a,int b)
    {
        int div=a/b;
        System.out.println("Division of two numbers is : "+div);
    }



}
