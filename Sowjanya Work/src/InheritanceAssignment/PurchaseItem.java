package InheritanceAssignment;

public class PurchaseItem {
    private String name;
    private double unitPrice;
    PurchaseItem() {

    }
    PurchaseItem(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }
    double getPrice(double unitPrice) {
        return unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

}
class WeighedItem extends PurchaseItem{
    private double weight;
    WeighedItem() {
    }
    WeighedItem(String name, double unitPrice, double weight) {
        super(name, unitPrice);
        this.weight = weight;
    }

}
class CountedItem extends PurchaseItem {
    private double quantity;
    CountedItem() {
    }
    CountedItem(String name, double unitPrice, double quantity) {
        super(name, unitPrice);
        this.quantity = quantity;
    }
}
