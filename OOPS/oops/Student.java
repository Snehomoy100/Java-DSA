package oops;

public class Student {
    // properties of student class
    int rollNo;
    String name;
    int studentId;

    // access modifiers
    private int batchNo; // private modifier
    public String courseName; // public modifier
    boolean isEnrolled; // default modifier

    // method props
    public int getRoll(int roll){
        return roll;
    }

    // setters
    public void setBatch(int number){
        batchNo = number;
    }
    // getters
    public int getBatch(){
        return batchNo;
    }
}
