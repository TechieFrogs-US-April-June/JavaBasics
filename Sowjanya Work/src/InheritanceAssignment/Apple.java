package InheritanceAssignment;

public class Apple {
    int number_of_items;

}
class Banana extends Apple {
    int number_of_items;

    Banana() {

    }
    void show() {
        this.number_of_items = 30;
        super.number_of_items = 100;
        System.out.println(super.number_of_items);
        System.out.println(this.number_of_items);
    }

    public static void main(String[] args) {
        Banana ban = new Banana();
        ban.show();


    }

}
