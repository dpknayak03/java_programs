package Equels;

public class float_objeq 
{    
    public static void main(String[] args) {
        float a=10f;
        float b=20f;
        if(a==b){
            System.out.println("True");
        }else
        {
            System.err.println("Flase");
        }

    Float float_obj = new Float(4);
    System.out.println("The float_obj is: "+ float_obj);

    Float float_obj1 = new Float(3);
    System.out.println("The float_obj1 is: "+ float_obj1);
    System.out.println(float_obj.equals(float_obj1));
    }
    
}
