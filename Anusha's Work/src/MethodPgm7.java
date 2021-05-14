class I{
    int i;
    void printNum(){
        System.out.println("value of i:"+i);
    }
}
class J extends  I{
    int j;
    void printNum(){
        //System.out.println("Value of i:"+ super.i);
        System.out.println("value of j:"+j);
    }
}

public class MethodPgm7 {
    public static void main(String[] args) {
        J jObj=new J();
        jObj.i=1;
        jObj.j=2;
        jObj.printNum();

    }
}
