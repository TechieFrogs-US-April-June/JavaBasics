class Employee1 extends Member1{
     String specialization;
}
 class Manager extends Member1{
     String department;
}
class Member1 {
     String name, address;
     int age, phno;
     double salary;

     void printSalary() {
     System.out.println("Salary is:" + salary);
            }

}

public class Member {
    public static void main(String[] args) {
        Manager mngObj=new Manager();
        mngObj.name="ABC";
        mngObj.age=25;
        mngObj.address="123,WEST LANE";
        mngObj.phno=123654789;
        mngObj.salary=80000;
        mngObj.department="HR";
        System.out.println("Name:"+""+mngObj.name+"  "+" Age:"+ mngObj.age+"  "+"Address:"+mngObj.address+"   "+"Phone No:"+mngObj.phno+"   "+"Salary:"+mngObj.salary+"   "+"Department:"+ mngObj.department);
        Employee1 empObj=new Employee1();
        empObj.name="xyz";
        empObj.age=30;
        empObj.address="456,EAST LANE";
        empObj.phno=758963142;
        empObj.salary=90000;
        empObj.specialization="DEVELOPER";
        System.out.println("Name:"+""+empObj.name+"  "+" Age:"+ empObj.age+"  "+"Address:"+empObj.address+"   "+"Phone No:"+empObj.phno+"   "+"Salary:"+empObj.salary+"   "+"Specialization:"+ empObj.specialization);

    }
}
