package src.InheritanceExercises.Members;

public class Employee extends Member{

    void specialization(){
        System.out.println(" This is a Employee Class ");
        System.out.println(" ----------------------- \n");
        System.out.println("Name: "+ name +"\n"+ "Age: " + age +"\n" + "Phone Number: " + phoneNumber +"\n" + "Address: "+ Address +"\n" + "Salary: " + salary );
    }

    public static void main(String[] args) {
        Employee empObj = new Employee();
        empObj.specialization();
        empObj.printSalary();
       
    }
    
}
