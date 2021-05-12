package src.InheritanceExercises.Members;

public class Manager extends Member{
    
    void department(){
       
         System.out.println(" This is a Manager Class ");
         System.out.println(" ----------------------- \n");

        System.out.println("Name: "+ name +"\n"+ "Age: " + age +"\n" + "Phone Number: " + phoneNumber +"\n" + "Address: "+ Address +"\n" + "Salary: " + salary );
    }

    public static void main(String[] args) {
        Manager manObj = new Manager();
        manObj.department();
        manObj.printSalary();
    }
}
