package BeginnersAssignment.Constructor;

public class ParameterizedConstructor {
    int empId;
    String empName;

    //parameterized constructor with two parameters
    ParameterizedConstructor(int id, String name){
        this.empId = id;
        this.empName = name;
    }
    //Method
    void info(){
        System.out.println("Id: "+empId+" Name: "+empName);
    }

    public static void main(String args[]){
        //creating object and passing parameters to constructor
        ParameterizedConstructor obj1 = new ParameterizedConstructor(10245,"sowjanya");
        ParameterizedConstructor obj2 = new ParameterizedConstructor(92232,"sowj");
        obj1.info(); //with object reference(obj1) calling the method(info())
        obj2.info();
    }
}
