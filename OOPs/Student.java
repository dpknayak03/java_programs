package OOPs;
class stud {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
 
    stud(String firstName,String lastName,int registration,int grade,int year){
        this.firstName = firstName;
        this.lastName  = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }
 
    void printFullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }
 
    public void isApproved(){
        if(grade >= 60){
            System.out.println("student is above 60");
        }
    }
 
    public int changeYearIfApproved() {
        if (grade >= 60) {
            year++;
        }
        //System.out.println();
        return year;
    }
}
 
public class Student{
    public static void main(String args[]) {
        stud st = new stud("Deepak ", "Nayak", 1, 70, 2);
        st.printFullName();
        st.isApproved();
        System.out.println(st.changeYearIfApproved());
    }
}
 