package src.InheritanceExercises.Members;

public class Member {
     
    String name;
    int age;
    int phoneNumber;
    String Address;
    int salary;

    void printSalary(){
        System.out.println("Salary of the Members : " + salary );
    }

    Member(){
        name = "Bill gates";
        age = 40;
        phoneNumber = 919456325;
        Address = "No 34, Washington Steet ";
        salary = 100000;
    }

    public static void main(String[] args) {
        Member memberObj = new Member();
        memberObj.printSalary();
        
    }
    
}
