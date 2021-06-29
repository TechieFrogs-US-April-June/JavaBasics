import java.util.*;

public class vectorPractices {
    public static void main(String[] args) {
       // vectorDefPgm1();
       // iterationPgm2();
        //forEachPgm3();
        //listIteratorPgm4();
        //getVectorPgm5();
       // compareVectorPgm6();
        //concatVectorPgm7();
        //commonDataPgm8();
        //duplicatePgm9();
        //vectorMethodsPgm10();
        //immutablePgm11();
        containsPgm12();
    }
    public static void vectorDefPgm1(){
        //accepts null and duplicates
        Vector<Integer> v1=new Vector<Integer>();//initial capacity is 10 by default
        v1.add(10);
        v1.add(50);
        v1.add(100);
        v1.add(null);
        v1.add(100);
        System.out.println(v1);
        Vector v2=new Vector(15);//Vector is Created by using Size method

    }
    public static void iterationPgm2(){
        Vector v2=new Vector();//accaepts heterogenoeos values and iterates
        v2.add(10);
        v2.add("A");
        v2.add('b');
        v2.add(null);
        v2.add(true);
        Iterator iterator = v2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void forEachPgm3(){
        Vector<Integer> v1=new Vector<Integer>();//initial capacity is 10 by default
        v1.add(10);
        v1.add(50);
        v1.add(100);
        v1.add(null);
        v1.add(100);
        for(Integer temp:v1){
            System.out.println(temp);
        }
    }
    public static void  listIteratorPgm4(){
        Vector<Integer> v1=new Vector<Integer>();//initial capacity is 10 by default
        v1.add(10);
        v1.add(50);
        v1.add(100);
        v1.add(null);
        v1.add(100);
        ListIterator<Integer> integerListIterator = v1.listIterator();
        System.out.println("*****Forward Direction");
        while(integerListIterator.hasNext()){
            System.out.println(integerListIterator.next());
        }
        System.out.println("*****Backward Direction");
        while (integerListIterator.hasPrevious()){
            System.out.println(integerListIterator.previous());
        }
    }
    public static void getVectorPgm5(){
        Vector<Integer> v1=new Vector<Integer>();//initial capacity is 10 by default
        v1.add(10);
        v1.add(50);
        v1.add(100);
        v1.add(null);
        v1.add(100);
        Integer integer = v1.get(2);
        System.out.println(integer);

    }
    public static void compareVectorPgm6(){
            Vector<Integer> v1=new Vector<Integer>();
            v1.add(10);
            v1.add(50);
            v1.add(100);
            Vector<Integer> v2=new Vector<Integer>();
            v2.add(10);
            v2.add(50);
            v2.add(100);
        boolean equals = v1.equals(v2);
        if(equals){
            System.out.println("Two Vectors Are Equals");
        }else{
            System.out.println("Two Vectors Are Not Equals");
        }
    }
    public static void concatVectorPgm7(){
        Vector<Integer> v1=new Vector<Integer>();
        v1.add(10);
        v1.add(50);
        v1.add(100);
        Vector<Integer> v2=new Vector<Integer>();
        v2.add(10);
        v2.add(50);
        v2.add(100);
        v1.addAll(v2);
        System.out.println(v1);
    }
    public static void commonDataPgm8(){
        Vector<Integer> v1=new Vector<Integer>();
        v1.add(10);
        v1.add(50);
        v1.add(100);
        Vector<Integer> v2=new Vector<Integer>();
        v2.add(10);
        v2.add(500);
        v2.add(150);
        v1.retainAll(v2);
        System.out.println(v1);
    }
    public static void duplicatePgm9(){
        Vector<Integer> v1=new Vector<Integer>();
        v1.add(10);
        v1.add(50);
        v1.add(100);
        Vector<Integer> v2=new Vector<Integer>();
        v2.add(10);
        v2.add(500);
        v1.removeAll(v2);
        System.out.println(v1);
    }
    public static void vectorMethodsPgm10(){
        Vector<Integer> v1=new Vector<Integer>();
        v1.add(10);
        v1.add(50);
        v1.add(100);
        boolean empty = v1.isEmpty();
        if(empty){
            System.out.println("Vector is Empty");
        }else{
            System.out.println("Vector is NOt Empty");
        }
        v1.set(1,55);
        System.out.println(v1);
        System.out.println(v1.size());
        v1.clear();
    }
    public static void immutablePgm11(){
        Vector<Integer> v1=new Vector<Integer>();
        v1.add(10);
        v1.add(50);
        v1.add(100);
        List<Integer> integers = Collections.unmodifiableList(v1);
        integers.add(25);
    }
    public static void containsPgm12(){
        Vector<String> v1=new Vector<String>();
        v1.add("ABC");
        v1.add("DEF");
        v1.add("GHI");
        String element="GHI";
        boolean contains = v1.contains(element);
        if(contains){
            System.out.println("Element Exists");
        }else{
            System.out.println("Element does Not Exist");
        }

    }
}
