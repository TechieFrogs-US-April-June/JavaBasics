package OopsInheritance;

class Home {
    void display() {
        System.out.println("house");
    }
}
class TownHome extends Home {
    void display1() {
        System.out.println("town house");
    }

}
class SingleFamily extends Home {
    void display2() {
        System.out.println("single house");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {
        SingleFamily sfObj = new SingleFamily();
        sfObj.display2();
        sfObj.display();
    }
}
