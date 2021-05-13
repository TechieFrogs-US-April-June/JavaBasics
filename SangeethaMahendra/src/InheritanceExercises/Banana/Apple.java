package src.InheritanceExercises.Banana;

public class Apple {
   private int number_of_items;
   // first invoke constructor
   Apple(){}
   Apple(int number_of_items){
     this.number_of_items = number_of_items;
     //System.out.println("The values of member variable 'number_of_items' of class Apple in the constructor  " + number_of_items);
}
  //then Method for return value
  void show(){
    System.out.println("The values of 'number_of_items' of class Apple in the Method:  "+ number_of_items);
}
}
