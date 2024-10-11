package Equels;

public class long_objeq
{
    public static void main(String[] args) 
    {
        long a=10;
        long b=20;
        if(a==b){
            System.out.println("True");
        }else
        {
            System.err.println("Flase");
        }

        Long long_obj = new Long(4);
        System.out.println("The long_obj is: "+ long_obj);
        System.out.println(long_obj.equals(2));

        Long long_obj1 = new Long(4);
        System.out.println("The long_obj is: "+ long_obj1);
        System.out.println(long_obj.equals(long_obj1));
    }
}