package Strings;

public class Test {

    public static void main(String[] args) {

        Product product = new Product(1, "Iphone");

        //here it prints the object reference and not the values like(1,Iphone).
        System.out.println(product);

        //(can't access like this from product to test cls bcoz variables are private in product cls,
        //so need to create getter and setter to access private variables in other classes)

        //product.id = 2;
        //product.product = "Mobile";
        //System.out.println(product.id+ "\n" +product.product);

       product.setId(2);
       product.setProduct("Tmobile");
       System.out.println(product.getId()+ "\n" +product.getProduct());

       String s = "123";//string
       Integer i = new Integer(456);//wrapper type

        //here it prints the value of s as 123. it doesn't print the object reference
        System.out.println(s);
        //In wrapper type as well it doesn't print the object reference.
        //It prints the value of i as 456.
        System.out.println(i);



    }



}
