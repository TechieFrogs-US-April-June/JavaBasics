package src.AccessModefiers;

public class ProtectedDemo {
    public static void main(String[] args) {
        ProtectedDemo object = new ProtectedDemo();
        System.out.println(object.totalValue); // accessing private data member of class A
        System.out.println(object.Multiply(10, 15)); // accessing private method of class A
    }

    class B
{
    private int totalValue = 50;
    private int Multiply(int a,int b)
    {
        return a*b;
    
}
}
    
}
