public class TryCatchEx1 
{
        public static void main(String[] args) 
        {
           /*int a=10/0;
           
           System.out.println("rest of the code"); /*As displayed in the above example, 
                                                     the rest of the code is not executed
                                                (in such case, the rest of the code statement is not printed).*/
           /*try  
            {  
            int data=50/0; //may throw exception   //Solution-the rest of the code statement is printed.
            }  
                //handling the exception  
            catch(ArithmeticException e)  
            {  
                System.out.println(e);  
            }  
            System.out.println("rest of the code");*/

            /*try  
            {  
            int data=50/0; //may throw exception   
                             // if exception occurs, the remaining statement will not exceute  
            System.out.println("rest of the code");  //not executed
            }  
                 // handling the exception   
            catch(ArithmeticException e)  
            {  
                System.out.println(e); */
                
                  
                /*try  
                {  
                int data=50/0; //may throw exception   
                }  
                    // handling the exception by using Exception class      
                catch(Exception e)  
                {  
                    System.out.println(e);  
                }  
                System.out.println("rest of the code");  */

                /*try  
                {  
                int data=50/0; //may throw exception   
                }  
                     // handling the exception  
                catch(Exception e)  
                {  
                          // displaying the custom message  
                    System.out.println("Can't divided by zero"); 
                    
                } */

             /* int i=50;  
                int j=0;  
                int data;  
                try  
                {  
                data=i/j; //may throw exception   
                }  
                    // handling the exception  
                catch(Exception e)  
                {  
                     // resolving the exception in catch block  
                    System.out.println(i/(j+2));  
                }  */

               /* try  
                {  
                int data1=50/0; //may throw exception   
          
                }  
                     // handling the exception  
                catch(Exception e)  
                {  
                System.out.println("First is printed");
                    // generating the exception in catch block  
                int data2=50/0; //may throw exception   
          
                }  
               System.out.println("rest of the code"); //not printed */

               try  
               {  
               int data=50/0; //may throw exception   
         
               }  
                   // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException  
               catch(ArrayIndexOutOfBoundsException e)  
               {  
                   System.out.println(e);  
               }  
               System.out.println("rest of the code");  
        }   
}
