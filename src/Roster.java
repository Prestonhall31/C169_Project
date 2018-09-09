import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Formatter;

public class Roster {

    private static ArrayList<Student> studentRoster = new ArrayList<>();

    public static void main(String[] args) {
        add("1", "John", "Smith", "John1989@gmail.com", 20, 88, 79, 59);
        add("2", "Suzan", "Erickson", "Erickson_1990@gmailcom", 19, 91, 72, 85);
        add("3", "Jack", "Napoli", "The_lawyer00@yahoo.com", 19, 85, 84, 87);
        add("4", "Erin", "Black", "Erin.black@comcast.net", 22, 91, 98, 82);
        add("5", "Preston", "Hall", "phall21@wgu.edu", 28, 100, 100, 100);
        print_all();
        print_invalid_emails();
        print_average_grade();
        remove("3");
        remove("3"); //prints error message

    }

//  Add students to array method
    public static void add(String studentID, String fName, String lName, String email, int age, double grade1, double grade2, double grade3){
        double[] grades = {grade1, grade2, grade3};
        Student newStudent = new Student(studentID, fName, lName, email, age, grades);
        studentRoster.add(newStudent);
    }

//  a.  public static void remove(String studentID) that removes students from the roster by student ID
    public static void remove(String ID) {
        int counter = 0;
        int index = Integer.parseInt(ID);
        for(Student i : studentRoster) {
            if (i.getStudentID().equals(ID)) {
                studentRoster.remove(index-1);
                counter++;
                break;
            }
        }
        if(counter == 0){
            System.out.println("Student with ID " + ID + " was not found.");
        } else {
            System.out.println("Student with ID " + ID + " was removed.");
        }
    }

//  b.  public static void print_all() that prints a complete tab-separated list of student data using accessor methods
    public static void print_all() {
        System.out.println("Students enrolled:");
        for (int i = 0; i < studentRoster.size(); i++) {
            studentRoster.get(i).print();
        }
    }

//  c.  public static void print_average_grade(String studentID) that correctly prints a student’s average grade by student ID
    public static void print_average_grade(){
        System.out.println("Print Average Grades");
        for(Student i : studentRoster){
            double average = (i.getGrades()[0] + i.getGrades()[1] + i.getGrades()[2]) / 3.0;
            Formatter aveRounded = new Formatter();
            aveRounded.format("%.2f", average);
            System.out.println(i.getFName() + " " + i.getLName() + "'s average grade was: " + aveRounded);
        }
    }

//  d.  public static void print_invalid_emails() that verifies student e-mail addresses and displays all invalid e-mail addresses to the user
    public static void print_invalid_emails() {
        for (Student i : studentRoster) {
            if (!i.getEmail().matches("^.+@.+\\..+$")) {
                System.out.println(i.getEmail() + " is not a valid email.");
            }
        }
    }
}
