package InheritancePack;

class PurchaseItem{
    private String name="Rosie";
    private double unitPrice=88.70;

    PurchaseItem(String s,double p){
        s=name;
        p=unitPrice;
        System.out.println("Name in PurchaseItem constructor "+s+"untiPrice in PurchaseItem constructor "+p);
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public void getPrice(){
        System.out.println("the unitPrice in Purchased Item class is"+unitPrice);
    }

}
class WeighedItem{


}
class CountedItem{

}

public class Challenge {
    public static void main(String[] args) {
        
    }
    
}
