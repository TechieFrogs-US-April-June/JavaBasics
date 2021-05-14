package src.InheritanceExercises.PurchaseItems;

public class Challange {

    public static void main(String[] args) {
        WeightedItem wObj = new WeightedItem("Rice", 500, 12);
        CountedItem cObj = new CountedItem("Dal", 200, 7);
        System.out.println("Weighted Item Price: "+wObj.getPrice());
        System.out.println("Counted Item price: "+cObj.getPrice());

        
    }
    
}
