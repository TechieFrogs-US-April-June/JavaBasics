package Assignments;
class Super3{
    int num=100;
}
class Sub extends Super3{
    int num=200;
    void number(){
        System.out.println(super.num);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Sub subObj=new Sub();
        subObj.number();
    }
}
