package src.InheritanceExercises.AandB;

public class B extends A {

    int k;

    void show(){
        System.out.println("Display the Value of i : " + i);
        System.out.println("Display the Value of j : " + j);
        System.out.println("The Value of K " + k );
    }

    

    public B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }



    public static void main(String[] args) {
        B bObj = new B(100 , 200, 300);
        bObj.show();
      //  System.out.println("The Value of K " + this.k ); //this cannot call in main method


        
    }
    
}
