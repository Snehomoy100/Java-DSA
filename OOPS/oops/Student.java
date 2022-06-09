package oops;

public class Student {
    // properties of student class
    int rollNo;
    String name;
    int studentId;

    // final keyword
    final double conversionRate = 0.95;

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

    // constructor for both the params
    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    // constructor for one of the params
    public Student(String name){
        this.name = name;
        // rollNo will get it's default data type value
    }

    // constructor without any params
    public Student(){
        name = "ABC";
        rollNo = 0;
    }

    // there will not be any access modifiers in case of only class statement

    // print method
    public void print(){
        System.out.println(name + " " + rollNo);
    }

}
