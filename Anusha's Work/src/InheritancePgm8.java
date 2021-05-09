
class A2{
    int i=5,j=10;
    public void show(){
        System.out.println("i and j values are:"+i +"  "+j);
    }

}

class B2 extends A2{
    int k=20;
    public void show(){
        System.out.println("value of k is "+k);
    }
}

public class InheritancePgm8  {
    public static void main(String[] args) {
      B2 b2Obj=new B2();
       b2Obj.show();

        /*InheritancePgm8 inheritObj=new InheritancePgm8();
        inheritObj.show();*/

    }
}
