package Oops;
class Student{
    String name;
    int rollNo;
}
public class constuctor {
    public static void main(String[] args){
        //creating new student
        Student std1 = new Student();
        std1.name = "mike";
        std1.rollNo = 54;
    
        System.out.println(std1.name + " " + std1.rollNo);


        // another creating new student
        Student sdt2 = new Student();
        sdt2.name = "john";
        sdt2.rollNo = 1;

        System.out.println(sdt2.name + " " + sdt2.rollNo);
    }
}
