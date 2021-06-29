package BeginnersAssignment.Constructor;

public class SimpleConstructor {
    String name;
    //Constructor
    SimpleConstructor(){
        this.name = "java";//this keyword, which refers to the current object
    }
    public static void main(String[] args) {
        SimpleConstructor obj = new SimpleConstructor();
        System.out.println(obj.name);
    }
}
