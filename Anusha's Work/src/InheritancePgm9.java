class Apple{
    int number_of_items=5;
}
class Banana extends Apple{
    int number_of_items;
    public void show(){
        System.out.println(number_of_items);
        System.out.println(super.number_of_items);
    }
    Banana(int i){
    number_of_items=i;
    }
}
public class InheritancePgm9 {
    public static void main(String[] args) {
        Banana bananaObj=new Banana(10);
        bananaObj.show();

    }
}
