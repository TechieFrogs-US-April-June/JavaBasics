package InheritancePack;

class A{
int i=2,j=3;
A(){

}
public void show(){
    System.out.println("values of i and j are: "+i+" "+j);
}
}
class B extends A{
int k=4;
public void show(){
    System.out.println("value of k is :"+k);
}

  
    public static void main(String[] args) {
        B b= new B();
        b.show();

    }
}
