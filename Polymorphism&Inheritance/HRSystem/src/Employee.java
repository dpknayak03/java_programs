public class Employee 
{

    String firstNeme;
    String lastName;
    int registration;
    int age;
    int daysWorked;
    int vacationDaysTaken;
    double salery;
    int yearsWorked;
    
    
    public Employee(String firstNeme, String lastName, int registration, int age, int daysWorked, int vacationDayTaken,
            double salery, int yearsWorked) {
        this.firstNeme = firstNeme;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDayTaken;
        this.salery = salery;
        this.yearsWorked = yearsWorked;
    }
    
    public int timeToRetirement(int age,int yearsWorked)
    {
        // time to retirement = min(60 - age, 40 - yearsWorked)
        return Math.min(60 - age, 40 - yearsWorked);
     }
  
     public int vacationTimeLeft(){
         // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
         return (daysWorked/360)*(30 - vacationDaysTaken);
     }
  
     public int calculateBonus(double salary)
     {
         // bonus = 2.2*salary
         return (int) ((int)2.2*salary);
     }

    
}
