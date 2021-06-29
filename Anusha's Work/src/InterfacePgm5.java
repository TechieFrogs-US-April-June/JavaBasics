interface FastFood{
     void Noodles();
     void FriedRice();
     void Burger();
}
class Sandwich implements FastFood{
    public void Noodles(){
        System.out.println("Noodles");
    }
    public void Burger() {
        System.out.println("Burger");
    }
    public void FriedRice() {
        System.out.println("Fried Rice");
    }
    public void Pizza(){
        System.out.println("Pizza");
    }
}
public class InterfacePgm5 extends Sandwich implements FastFood{
    public void Fries(){
        System.out.println("Fries");
    }
    public void Coke(){
        System.out.println("Coke");
    }
    public static void main(String[] args) {
        InterfacePgm5 interfaceObj5=new InterfacePgm5();
        interfaceObj5.Noodles();
        interfaceObj5.Burger();
        interfaceObj5.FriedRice();
        interfaceObj5.Pizza();
        interfaceObj5.Fries();
        interfaceObj5.Coke();

    }
}
