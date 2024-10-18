import java.util.Scanner;
public class Scanner_Class{
  public static void main( String[] args ) {
    
    Scanner sc = new Scanner(System.in);
     
    System.out.println("What is your name?");
    String userName = sc.next();
    System.out.printf("Hello %s! It's nice to meet you.", userName);
  }
}