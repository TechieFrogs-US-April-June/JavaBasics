class Counter{
    int i,counter=0;
    public void increment(){
        for(i=1;i<=3;i++){
            counter=counter+1;
            System.out.println("i="+i);
        }

    }
}

public class CounterPgm extends Counter {

    public static void main(String[] args) {
    CounterPgm countObj=new CounterPgm();
    countObj.increment();
    }
}
