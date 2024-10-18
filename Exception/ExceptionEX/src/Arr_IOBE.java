public class Arr_IOBE 
{
    public static void main(String[] args) 
    {
         int a[]=new int[5];  
         //a[10]=50;
         try{
            System.out.println("in try");
           // int a[]=new int[5]; 
            a[10]=50;
         } 
         catch(Exception e){
            System.out.println(e);
         }  
    }
}
