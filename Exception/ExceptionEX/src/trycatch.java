public class trycatch 
{
    public static void main(String[] args) throws Exception {
        System.out.println("Befor try-catch");
        try{
            System.out.println("in try block");
            int a=10/0;
        }//end try block
        
        finally{
            System.out.println("in finally");
        }
    }   
} 

