package Strings;

public class Product {

    private int id;
    private String product;

    public int getId() {
        return id;
    }

    public void  setId(int id) {
        this.id = id;

    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }



    Product(int id, String product) {
        this.id = id;
        this.product = product;
        System.out.println(id);
        System.out.println(product);
    }
}
