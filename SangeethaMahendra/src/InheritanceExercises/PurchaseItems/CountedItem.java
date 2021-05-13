package src.InheritanceExercises.PurchaseItems;

public class CountedItem extends PurchaseItems {
    private int quantity;

     //constructor to initialize the instance variables to call super Constructor
     CountedItem(){};
     CountedItem(String name, double unitPrice,int q){
         super(name,unitPrice);
         this.quantity = q;
    }

     //A method getPrice that returns the unitPrice
     double getPrice(){
        return this.quantity * super.getPrice();
       }

    // public static void main(String[] args) {
    //     CountedItem cObj = new CountedItem();
    // }
    
}
