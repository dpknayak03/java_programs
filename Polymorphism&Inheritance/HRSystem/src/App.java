
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Employee e1=new Employee("Ranjan", "Banarjee", 10, 30, 2500, 10, 25000.3,6 );
        System.out.println("Time to retire : "+e1.timeToRetirement(e1.age,e1.yearsWorked));
    
        SalesRep s1=new SalesRep("A", "sss", 10, 30, 730, 05, 30000, 2, 10000);
        SalesRep s2=new SalesRep("B", "ss", 10, 30, 730, 05, 30000, 2, 20000);
        SalesRep s3=new SalesRep("C", "sss", 10, 30, 730, 05, 30000, 2, 30000);
     
        SalesManager SM=new SalesManager("Bhayankar", "sss", 10, 30, 730, 05, 30000, 2, 30000,s1.getSalesMade()+s2.getSalesMade()+s3.getSalesMade());
        SM.calculateComission();
    }
}
