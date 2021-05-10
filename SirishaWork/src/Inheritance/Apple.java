package SirishaWork.src.Inheritance;

public class Apple {
    private int number_of_items;
    Apple() {}
    Apple(int number_of_items) {
        this.number_of_items = number_of_items;
    }

    public int getNumber_of_items() {
        return number_of_items;
    }
}

class Banana extends Apple {
    private int number_of_items;

    Banana() { }
    Banana(int apples, int bananas) {
        super(apples);
        this.number_of_items = bananas;
    }
    void show() {
        System.out.println("Number of bananas: "+this.number_of_items);
        System.out.println("Number of apples: "+getNumber_of_items());
    }

    public static void main(String[] args) {
        Apple apple = new Apple(100);
        Banana ban = new Banana(100, 50);
        ban.show();
    }

}
