/*Example of Abstract class that has an abstract method

In this example, Bike is an abstract class that contains only one abstract method run. Its implementation is provided by the Honda class. */
package Abstraction;

abstract class Bike
{  
  abstract void run();  
}  
class Honda extends Bike
{  
void run()
{
  System.out.println("running safely");
}  
public static void main(String args[])
{  
 Bike obj = new Honda();  
 obj.run();  
}  
}  

     
