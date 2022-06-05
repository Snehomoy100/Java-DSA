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
    private int age;

    // method props
    public int getRoll(int roll){
        return roll;
    }

    public void setAge(int age){
        if(age <= 0){
            return;
        }
        this.age = age;
        System.out.println("this " + this); // this refers to the current object
    }

    // setters
    public void setBatch(int number){
        batchNo = number;
    }
    // getters
    public int getBatch(){
        return batchNo;
    }

    public int getAge(){
        return age;
    }

}
