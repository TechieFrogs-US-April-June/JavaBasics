class  PurchaseItem{
    private String name;
    private double unitprice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }



    PurchaseItem(String name,double unitprice) {
        this.name=name;
        this.unitprice=unitprice;
    }
    public double getPrice(){
        return unitprice;
    }

}
class WeightedItem extends PurchaseItem{
    private double weightinkg;

    public double getWeightinkg() {
        return weightinkg;
    }

    public void setWeightinkg(double weightinkg) {
        this.weightinkg = weightinkg;
    }

    WeightedItem(String name, double unitprice) {
        super(name, unitprice);
    }
    public double getPrice(){
        return super.getUnitprice()*weightinkg;

    }
}
class CountedItem extends PurchaseItem{
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    CountedItem(String name, double unitprice) {
        super(name, unitprice);
    }
    public double getPrice(){
        return super.getUnitprice()*quantity;
    }
}

public class InheritancePgm10 {
    public static void main(String[] args) {
        WeightedItem weightObj=new WeightedItem("ABC",2.2);
        weightObj.setWeightinkg(2);
        System.out.println(" price of the purchasedItem based on its unit price and weight(kg):"+weightObj.getPrice());
        CountedItem countedItemObj=new CountedItem("XYZ",3);
        countedItemObj.setQuantity(3);
        System.out.println(" price of the purchasedItem based on its unit price and Quantity:"+countedItemObj.getPrice());



    }
}
