public class trycatch1
{
    public static void main(String[] args) throws Exception {
        System.out.println("Befor try-catch");
        try{
            System.out.println("in try block");
            int a=100/0;
        }//end try block
        catch(Exception a){

        }
        
        finally{
            System.out.println("in finally");
        }
    }   
} 