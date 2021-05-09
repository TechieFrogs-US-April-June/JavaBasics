package SirishaWork.src.Inheritance;

public class Parent {
  private void p() {
     System.out.println("This is parent class");
 }
}
    class child  extends Parent{
        void a(){
            System.out.println("This is child class");
        }
            public static void main(String[] args) {
                Parent parentobj = new Parent();
                //parentobj.p();
               child childobj = new child();
                childobj.a ();
            }
        }


