package oops; // this package stores the Student class inside of it 

public class OopsSample {
    public static void main(String[] args) {
        // student class be accessed over here because of the oops package
        Student s1 = new Student(); // creation of a new object (instance of a class)
        s1.rollNo = 10; // properties of the class
        s1.name = "Snehomoy"; // properties of the class
        System.out.println(s1.name + " " + s1.rollNo);
        System.out.println(s1); // stores the reference address
        System.out.println(s1.studentId); // the props takes default values
    }
    
}
