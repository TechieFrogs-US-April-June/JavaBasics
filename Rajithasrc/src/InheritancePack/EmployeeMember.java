package InheritancePack;
class Member{
    String name;
    int age;
    String number;
    String address;
    int salary;

    public void printSalary(){
        System.out.println(salary);
    }
}
class Employee1 extends Member{

    String specialization;
}
class Manager extends Member{

    String department;
    
}

class EmployeeMember {
    public static void main(String[] args){
        Employee1 e = new Employee1();
        e.name="Alice";
        e.age=26 ;
        e.number ="323939093";
        e.salary= 80000;
        e.specialization="Devops developer";
        System.out.println("Name: "+e.name+"Age: "+e.age+"Number: "+e.number+"Salary: "+e.salary+"Specialization: "+e.specialization );

        Manager m = new Manager();
        m.name="Sam";
        m.age=29 ;
        m.number ="8979868758";
        m.salary= 100000;
        
        System.out.println("Name: "+m.name+"Age: "+m.age+"Number: "+m.number+"Salary: "+m.salary);

    }
}
