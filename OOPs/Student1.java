package OOPs;

public class Student1
{
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    public Student1()
    {
        this.firstName = "";
        this.lastName = "";
        this.registration = 0;
        this.grade = 0;
        this.year = 1;
    }

    public Student1(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = 0;
        this.grade = 0;
        this.year = 1;
    }

    public Student1(String firstName, String lastName, int registration, int grade, int year)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }


    public void printFullName()
    {
        System.out.println("Full name: " + firstName + " " + lastName);
    }
    public boolean isApproved()
    {
        return grade >= 60;
    }
    public int changeYearIfApproved()
    {
        if(grade >= 60)
        {
            year += 1;
            System.out.println("Congratulations");
        }
        else
        {
            System.out.println("No");
        }
        return year;
    }
       public void enroll(Student1 student)
       {
	     
	   }
	
	   public void unEnroll(Student1 student){
	     
	   }
	
	   public int countStudents(){
	       //TODO implement
	       return 0;
	   }
	   
	   public int bestGrade(){
	       //TODO implement
	       return 0;
   }

    public static void main(String[] args)
    {
        Student1 s1 = new Student1("Deepak", "Nayak", 101, 70, 2024);

        s1.printFullName();

        if(s1.isApproved())
        {
            System.out.println("Approved");
        }
        else
        {
            System.out.println("Not Approved");
        }

        s1.changeYearIfApproved();
    }
}