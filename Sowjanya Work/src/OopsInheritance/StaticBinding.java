package OopsInheritance;

class Vehicle1 {
    public static void car() {
        System.out.println("vehicle car");
    }
}
class Honda extends Vehicle1 {
    public static void car() {
        System.out.println("Honda car");
    }
}
public class StaticBinding {
    public static void main(String[] args) {
        Vehicle1 vObj = new Honda();
        vObj.car();

        Honda hObj = new Honda();
        hObj.car();
    }
}
