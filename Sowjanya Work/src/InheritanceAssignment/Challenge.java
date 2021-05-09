package InheritanceAssignment;

class PurchaseItem {
    private String name;
    private double unitPrice;
    PurchaseItem() {    }
    PurchaseItem(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }
    double getPrice() {
        return this.unitPrice;
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
    double getPrice() {
        return this.weight * super.getPrice();
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
    double getPrice() {
        return this.quantity * super.getPrice();
    }
}

public class Challenge {
    public static void main(String[] args) {
        CountedItem cItem = new CountedItem("phone", 500, 12);
        WeighedItem wItem = new WeighedItem("vegetables", 25, 25);
        System.out.println("Counted Item price: "+cItem.getPrice());
        System.out.println("Weighted Item Price: "+wItem.getPrice());
    }
}
