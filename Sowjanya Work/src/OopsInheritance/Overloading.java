package OopsInheritance;

class Vehicle {
    void steering() {
        System.out.println("Vehicle steering");
    }

     void steering(int size) {
        for(int i = 0; i < size; i++) {
            System.out.println(i);
        }
    }

}
public class Overloading {

    public static void main(String[] args) {
        Vehicle vehObj = new Vehicle();
        vehObj.steering();
        vehObj.steering(5);
    }

}
