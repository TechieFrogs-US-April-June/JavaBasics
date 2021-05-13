abstract class Marks{
    abstract void getPercentage();
}
class Aa extends Marks{
    int a1,b1,c1;
    Aa(int a1,int b1,int c1){
        this.a1=a1;
        this.b1=b1;
        this.c1=c1;

    }
    void getPercentage(){
        float avg=(float) (a1+b1+c1)/300;
        System.out.println("avg:"+avg);
        float PercentageA=(avg)*100;
        System.out.println("Percentage of Student A:"+PercentageA);
    }

}
class Bb extends Marks{
    int s1,s2,s3,s4;
    Bb(int a2,int b2,int c2,int d2){
        this.s1=a2;
        this.s2=b2;
        this.s3=c2;
        this.s4=d2;
    }
    void getPercentage(){
        float avg=(float) (s1+s2+s3+s4)/400;
        float PercentageB=(float) (avg)*100;
        System.out.println("Percentage of Student B:"+PercentageB);
    }

}
public class AbstractPgm3  {

    public static void main(String[] args) {
        Aa aObj=new Aa(50,50,50);
        aObj.getPercentage();
        Bb bObj=new Bb(50,50,50,50);
        bObj.getPercentage();

    }
}
