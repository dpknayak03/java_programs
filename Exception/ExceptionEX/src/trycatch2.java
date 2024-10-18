public class trycatch2
{
    public static void main(String[] args) throws Exception {
        System.out.println("Befor try-catch");
        try{
            System.out.println("in try block");
            int a=100/10;
        }//end try block
        catch(Exception a){
            System.out.println(a);
        }
        
        finally{
            System.out.println("in finally");
        }
    }   
} 