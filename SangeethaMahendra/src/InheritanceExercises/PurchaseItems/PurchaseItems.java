package src.InheritanceExercises.PurchaseItems;

//•	two private instance variables name (String) and unitPrice (double)
public class PurchaseItems {
    private String name;
    private double unitPrice;

    //Explicitly created default constructor
    PurchaseItems(){}

    //constructor to initialize the instance variables
    PurchaseItems(String name, double unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;
    }

    //A method getPrice that returns the unitPrice
    double getPrice(){
     return this.unitPrice;
    }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public double getUnitPrice() {
    //     return unitPrice;
    // }

    // public void setUnitPrice(double unitPrice) {
    //     this.unitPrice = unitPrice;
    // }

    // public static void main(String[] args) {
    //     PurchaseItems purObj = new PurchaseItems("", 300);
    //     purObj.getPrice();

        
    // }
    
}
