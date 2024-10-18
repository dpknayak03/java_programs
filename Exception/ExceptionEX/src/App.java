public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Befor try-catch");
        try{
            System.out.println("in try block");
            int a=10/0;
        }//end try block
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("in finally");
        }
    }
}
