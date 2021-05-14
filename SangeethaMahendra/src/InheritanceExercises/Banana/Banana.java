package src.InheritanceExercises.Banana;

public class Banana extends Apple{
    private int number_of_items;

    //constructor
    Banana(){}
    Banana(int number_of_items,int num){
        super(number_of_items);
        this.number_of_items = num;
    }
       void show(){
        super.show();
        System.out.println("The values of 'number_of_items' of class Banana :  "+this.number_of_items);
       
     

    }

    public static void main(String[] args) {
        //Apple appleoObj= new Apple(100);
        Banana bananaObj = new Banana(100, 50);
        bananaObj.show();
    }
    
}
