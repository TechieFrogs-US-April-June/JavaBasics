package OopsInheritance;

class Vehicles {
    public void car() {
        System.out.println("vehicle car");
    }
}
class Nissan extends Vehicles {
    public void car() {
        System.out.println("Nissan car");
    }
}
public class DynamicBinding {
    public static void main(String[] args) {
        Vehicles Obj = new Nissan();
        Obj.car();

        Nissan nObj = new Nissan();
        nObj.car();
    }

}
