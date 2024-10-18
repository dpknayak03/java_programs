public class NPE 
{
    public static void main(String[] args) 
    {
        try{
            System.out.println("in try block");
            //String s="Deepak";
            String s=null;
            System.out.println(s.length());
        }   
        catch(Exception e){
            System.out.println(e);
        } 
    }   
}
