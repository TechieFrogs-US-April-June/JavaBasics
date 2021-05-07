package InheritancePack;
class Apple{
    int number_of_items=5;
}
class Banana extends Apple{
    int number_of_items=8;

    Banana(){
        System.out.println("Banana constructor");
    }

    public void show(){
        System.out.println("number or items of super class Apple are "+super.number_of_items+"   number of items of sub class Banana are   "+this.number_of_items);
    }
    
    public static void main(String[] args) {
        
        Banana b = new Banana();
        b.show();
    }
}
