class bankA{
    int deposited_money_in_$=1000;
    void getBalance(){
        System.out.println("Money Deposited in Bank A:"+"$"+deposited_money_in_$);
    }
}
class bankB{
    int deposited_money_in_$=1500;
    void getBalance(){
        System.out.println("Money Deposited in Bank B:"+"$"+deposited_money_in_$);
    }
}

class bankC{
    int deposited_money_in_$=2000;
    void getBalance(){
        System.out.println("Money Deposited in Bank C:"+"$"+deposited_money_in_$);
    }
}

public class MethodPgm6 {
    public static void main(String[] args) {
        bankA bankAObj=new bankA();
        bankAObj.getBalance();
        bankB bankBObj=new bankB();
        bankBObj.getBalance();
        bankC bankCObj=new bankC();
        bankCObj.getBalance();


    }
}
