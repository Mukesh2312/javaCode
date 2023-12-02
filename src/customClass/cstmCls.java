package customClass;

class Employee{
    private int id;
    private String name;

    // ceating construtor

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    // creating method for printing details


    public void printDetails(){
        System.out.println(this.id+" "+this.name);
    }

}
public class cstmCls {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "mike");
        Employee e2 = new Employee(2, "john");

        e1.printDetails();
        e2.printDetails();
    }
}
