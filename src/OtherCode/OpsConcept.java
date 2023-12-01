package OtherCode;

class Student{
    String name;
    int rollno;
    boolean bookIssued;
    int yearOfAdmission;

    // this is construtor. name will be same as per class name.
    Student(int year){
        System.out.println("Writing the Exam");
        bookIssued = true;
        yearOfAdmission = year; // taking as a parameter
        //yearOfAdmission = 2022; // hard coded value

    }
    
    void writeExam(){
        System.out.println("Writing the Exam");
    }


}

class Car{
    String name;
    String year;
    String mdl;
    void startCar(){
        System.out.println("Starting the car.");
    }
    
    Car(String carName, String carMadeyear, String model){
        name = carName;
        year = carMadeyear;
        mdl = model;
        
    }
}

public class OpsConcept {
    public static void main(String[] args) {
//        Student std1 = new Student(2022); // constrctor rul autometically when obj creted
//        std1.name = "Alx";
//        std1.rollno = 101;
//        System.out.println(std1.name+" "+std1.rollno);
//        std1.writeExam();
//        System.out.println(std1.name);
//        System.out.println(std1.rollno);
//        System.out.println(std1.bookIssued);
//        System.out.println(std1.yearOfAdmission);


//        Car bmw = new Car();
//        bmw.name = "BMW 200d";
//        bmw.year = "2012";

//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        String year = sc.next();

//        Car bmw = new Car(); // creation of object
//        bmw.name = name; // taking from user
//        bmw.year = year; // taking drom user

//        System.out.println(bmw.name+" "+bmw.year);
//        bmw.startCar();


        Car bmw = new Car("BMW","2022", "200d");
        System.out.println(bmw.name+" "+bmw.year+" "+bmw.mdl);
    }
}
