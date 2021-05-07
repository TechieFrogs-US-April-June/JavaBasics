public class EmployeeInheritance {
    float salary=4000;
}
  class Programmer extends EmployeeInheritance{
int bonus=10000;
    public static void main(String[] args) {
        Programmer empObj=new Programmer();
       System.out.println(empObj.salary);
        System.out.println(empObj.bonus);


    }
}