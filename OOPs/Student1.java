package OOPs;

import java.util.ArrayList;
import java.util.List;

class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    void printFullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }

    public boolean isApproved() {
        return grade >= 60;
    }

    public int changeYearIfApproved() {
        if (isApproved()) {
            year++;
            System.out.println("Congratulations! " + firstName + " year " + year);
        }
        return year;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
}

class Course {
    String courseName;
    String professorName;
    int year;
    List<Student> children; 

    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.children = new ArrayList<>();
    }

    public void enroll(Student student) {
        if (!children.contains(student)) {
            children.add(student);
            System.out.println(student.getName() + " enrolled in " + courseName);
        } else {
            System.out.println(student.getName() + " is already enrolled in " + courseName);
        }
    }

    public void enroll(Student[] studentsArray) {
        for (Student student : studentsArray) {
            enroll(student);
        }
    }

    public void unEnroll(Student student) {
        if (children.remove(student)) {
            System.out.println(student.getName() + " unenrolled from " + courseName);
        } else {
            System.out.println(student.getName() + " is not enrolled in " + courseName);
        }
    }

    public int countStudents() {
        return children.size();
    }

    public int bestGrade() {
        int best = 0;
        for (Student student : children) {
            if (student.getGrade() > best) {
                best = student.getGrade();
            }
        }
        return best;
    }

    public String toString() {
        return "Course: " + courseName + ", Professor: " + professorName + ", Year: " + year + ", Enrolled Students: " + children.size();
    }
}

public class student1 {
    public static void main(String[] args) {
        Student st = new Student("Deepak", "Nayak", 1, 80, 2024); 

        st.printFullName(); 
        if (st.isApproved()) {
            System.out.println("approved");
        } else {
            System.out.println("not approved");
        }
        System.out.println("Current Year: " + st.changeYearIfApproved());


        Course course = new Course("Java programming", "Ambika mam", 2024);


        course.enroll(st); 
        System.out.println(course);
    }
}