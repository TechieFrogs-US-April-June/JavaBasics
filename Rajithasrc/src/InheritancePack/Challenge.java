package InheritancePack;

class PurchaseItem{
    private String name="Rosie";
    private double unitPrice=88.70;

    public PurchaseItem(){

    }

    public PurchaseItem(String name,double unitPrice){
        this.name=name;
       this.unitPrice=unitPrice;
        System.out.println("Name in PurchaseItem constructor   "+name+"  unitPrice in PurchaseItem constructor "+unitPrice);
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double getPrice(){
        return unitPrice;
    }

}
 class WeighedItem extends PurchaseItem{
    
    private double weight=50.634;

    public WeighedItem(){

    }

    public WeighedItem(double weight){
       super("ram",56.75);
       this.weight=weight;
        System.out.println("weight is :  "+weight);
    }


    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice(){
        return weight *super.getPrice();
    }

}
class CountedItem extends PurchaseItem{

    private int quantity=80;

    public CountedItem(){

    }

    public CountedItem(int quantity) {
        
        this.quantity=quantity;
        System.out.println("Quantity is : "+quantity);
    }


        public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice(){
        return quantity *super.getPrice();
    }
}

public class Challenge {
    public static void main(String[] args) {
         WeighedItem w = new WeighedItem(70.89);
              
       System.out.println(w.getPrice());
         CountedItem c=new CountedItem(50);
         System.out.println(c.getPrice());
         
    }
       
}
