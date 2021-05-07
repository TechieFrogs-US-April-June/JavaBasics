public class TestPattern {
    protected int a=5;
     public int b=10;
     private int z=30;

     public void myDisplay(){
         System.out.println("In test pattern"+a+" "+b);

     }
    //public TestPattern(){
        //System.out.println("In Test Pattern Constructor");
    //}
    public TestPattern(int a,int b){
     this.a=a;
     this.b=b;
    }

    
}
