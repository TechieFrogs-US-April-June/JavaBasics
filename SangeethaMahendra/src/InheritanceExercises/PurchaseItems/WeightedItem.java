package src.InheritanceExercises.PurchaseItems;

public class WeightedItem extends PurchaseItems{
    
    private double weight;

      //constructor to initialize the instance variables to call super Constructor
      WeightedItem(){ }

     WeightedItem(String name, double unitPrice, double w){
        super(name,unitPrice);
        this.weight = w;
       
    }
    double getPrice() {
        return this.weight * super.getPrice();
    }

  


}
