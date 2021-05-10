package OopsPolymorphism;

public class AddOverLoading {
    int add(int a, int b) {
        System.out.println("Inside 2 argument method");
        return a + b;
    }

    int add(int a, int b, int c) {
        System.out.println("Inside 3 argument method");
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
        System.out.println("Inside 4 arg method");
        return a+ b+ c + d;
    }

    public static void main(String[] args) {
        AddOverLoading addObj = new AddOverLoading();
        System.out.println(addObj.add(2, 3));
        System.out.println(addObj.add(2, 3, 4, 5));
        System.out.println(addObj.add(2, 3, 4));
    }
}
