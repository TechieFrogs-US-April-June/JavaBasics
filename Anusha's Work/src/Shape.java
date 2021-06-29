 class Shape1{
    public void printShape(){
        System.out.println("This is a Shape");
    }
}


 class Rectangle2 extends Shape1{
    public void printRectangle(){
        System.out.println("This is  Rectangular Shape");
    }

}


 class Circle extends Shape1{
    public void printCircle(){
        System.out.println("This is  Circular Shape");
    }
}

 class Square extends Rectangle2{
     public void printsquare(){
         System.out.println("Square is a Rectangle");
     }
 }



public class Shape{
    public static void main(String[] args) {
        Square sqObj=new Square();
        sqObj.printShape();
        sqObj.printRectangle();


    }
}
