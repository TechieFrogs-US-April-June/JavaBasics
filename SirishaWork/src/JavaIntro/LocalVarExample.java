package SirishaWork.src.JavaIntro;

public class LocalVarExample {
    //instance variable
    public String myVar="instance variable";

    public void myMethod(){
        //local variable
        String myVar = "Inside Method";
        System.out.println(myVar);
    }

    public static void main(String[] args) {
        //creating object
        LocalVarExample obj = new LocalVarExample();
        System.out.println("Calling Method");
        obj.myMethod();
        System.out.println(obj.myVar);
    }
}
