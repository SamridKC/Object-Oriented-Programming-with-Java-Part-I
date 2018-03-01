public class Student {
    private String name;
    private String studentNumber;

    public Student(String studentName, String studentNum){
        this.name = studentName;
        this.studentNumber = studentNum;
    }

    public String getName() {
        return this.name;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public String toString() {
        return this.name + " (" + this.studentNumber + ")";
    }
}
