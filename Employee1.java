public class Employee1{
    String name;
    int id;
    double salary;
    Long phno;
    public Employee1(String name,int id,double salary,Long phno){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.phno=phno;
    }
    public void displayInfo(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("phone Number: "+phno);

    }
    public static void main(String[] args){
        Employee1 emp1=new Employee1("XYZ",101,50000.0,123456778L);
        emp1.displayInfo();
    }
}