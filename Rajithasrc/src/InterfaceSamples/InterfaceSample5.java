package InterfaceSamples;
interface FastFood {
    void Burger();
    void Pizza();
    
}

class Sandwich implements FastFood {

    @Override
    public void Burger() {
        System.out.println("Add Burger to Sandwich order");
        
    }

    @Override
    public void Pizza() {
        System.out.println("Add Pizza to Sandwich order");
        
    }

}


public class InterfaceSample5  extends Sandwich{

    public static void main(String[] args) {
        
        InterfaceSample5 infsobj = new InterfaceSample5();
        infsobj.Burger();
        infsobj.Pizza();
    }
    
}

