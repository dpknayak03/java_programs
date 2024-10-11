package Equels;
public class int_objeq 
{
    public static void main(String[] args) 
    {   
        int a=10;
        int b=20;
        if(a==b){
            System.out.println("True");
        }else
        {
            System.err.println("Flase");
        }
       
        Integer int_obj = new Integer(4);
        System.err.println("The int_obj is: "+ int_obj);

        Integer int_obj1 = new Integer(3);
        System.err.println("The int_obj is: "+ int_obj1);
        System.err.println(int_obj.equals(int_obj1));

    } 
    
}
