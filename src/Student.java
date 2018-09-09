import javax.xml.bind.SchemaOutputResolver;

public class Student {

    private String studentID;
    private String fName;
    private String lName;
    private String email;
    private int age;
    private double[] grades;


    //Constructor - using all  of the input parameters
    public Student(String studentID, String fName, String lName, String email, int age, double[] grades){
        setStudentID(studentID);
        setFName(fName);
        setLName(lName);
        setEmail(email);
        setAge(age);
        setGrades(grades);
    }

    //Accessor Methods (get methods) and Mutator methods (set methods)
    //Student ID
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    //First Name
    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    //Last Name
    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    //Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//     Grades
    public double[] getGrades(){
        return grades;
    }

    public void setGrades(double[] grades){
        this.grades = grades;
    }


//    Print method - print() to print specific student data (e.g., student ID, first name, last name) using accessors (i.e., getters)
    public void print(){
        System.out.println(
            "Student ID:\t" + getStudentID() + "\tName:\t" + getFName() + " " + getLName() +
                    "\tEmail:\t" + getEmail() + "\tAge:\t" + getAge() +
                    "\tGrades: " + getGrades()[0] + ", " + getGrades()[1] + ", " + getGrades()[2]);
            }

}

