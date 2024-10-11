package ControlFlow;
import java.util.Scanner;
/*
Part 1: Commission Calculator
Using IntelliJ, write a Java app that takes numerical input from a user
The app should calculate commission based on this chart used by the retail store.
Sales Range	Commission
above 10000$	30%
5001 - 9999$	20%
1001 - 4999$	10%
below 1000$	N/A
Example: if a user enters 7677 as their sales figure, it should calculate commission at 20%. */
public class Commission 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sales amount for wich we have to calculate commision ");

        int sales_amount=sc.nextInt();
        int commission_per=0;
        float com;

        if(sales_amount<=1000)
        {
            System.out.println("Sorry better luck next time sasles is note fit");
        }
        else if(sales_amount>=1001 && sales_amount >= 4999)
        {
            commission_per = 10;
            com=Calc_com(commission_per , sales_amount);
            System.out.println("***********************************");
            System.out.println("commision for 10% ");
            System.out.println("commission amount is "+com);
        }
        else if(sales_amount>=5000 && sales_amount >= 9999)
        {
            commission_per = 20;
            com=Calc_com(commission_per , sales_amount);
            System.out.println("***********************************");
            System.out.println("commision for 20% ");
            System.out.println("commission amount is "+com);
        }
        else if(sales_amount>=10000)
        {
            commission_per = 30;
            com=Calc_com(commission_per , sales_amount);
            System.out.println("***********************************");
            System.out.println("commision for 30% ");
            System.out.println("commission amount is "+com);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
    public static float Calc_com(int com, int sales_amount)
    {
        return (sales_amount*com)/100;
    }
}
