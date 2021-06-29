import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class arrayListPractices {
    public static void main(String[] args) {
        //arrayListdefintionpgm1();
        //nullDuplicatesPgm2();
        //iterationUsingForEachPgm3();
        // iteratorPgm4();
        //listIteratorPgm5();
        // getElementPgm6();
        // compareTwoArrayListsPgm7();
        //concatArrayListsPgm8();
       // commonDataPgm9();
        //duplicatesdisplayPgm10();
        //sizeofArrayListPgm11();
        //clearElementsPgm12();
        //immutableArrayListPgm13();
        //containsPgm14();
        //removeDuplicatesPgm15();
        //isEmptyPgm16();
        //addElementPgm17();
        //removeElementPgm18();
        //replaceElementPgm19();
        //sortArrayListPgm20();
        //cloneArrayListPgm21();
        // arrayToArrayListPgm22();
        //arrayToArrayListPgm23();
        //arrayListToArrayPgm24();
        //synArrayListPgm25();
        //userObjPgm26();
        //failfastPgm27();
       // copyOnPgm28();
    }
    public static void arrayListdefintionpgm1()
    {
        List<String> l=new ArrayList<String>();//generics used to accept homogenoeous data
        l.add("J");
        l.add("A");
        l.add("V");
        l.add("A");
        System.out.println(l);
    }
    public static void nullDuplicatesPgm2(){
        List l=new ArrayList();//accepts heterogeneous,null n duplicates
        l.add("A");
        l.add(10);
        l.add(null);
        l.add('b');
        l.add('a');
        System.out.println(l);

    }
    public static void iterationUsingForEachPgm3(){
        List<String> l=new ArrayList<String>();
        l.add("JAVA");
        l.add("TECHIE");
        l.add("FROGS");
        for(String temp :l){
            System.out.println(temp);
        }
    }
    public static void iteratorPgm4(){
        List<String> l=new ArrayList<String>();
        l.add("Java");
        l.add("is");
        l.add("a");
        l.add("Programming");
        l.add("Language");
        Iterator<String> lt = l.iterator();
        while (lt.hasNext()){
            System.out.println(lt.next());
        }
    }
    public static void listIteratorPgm5(){
        List<Integer> l=new ArrayList<Integer>();
        l.add(5);
        l.add(3);
        l.add(10);
        l.add(20);
        ListIterator<Integer> llt = l.listIterator();
        System.out.println("*****Forward Direction*****");
        while(llt.hasNext()){
            System.out.println(llt.next());
        }
        System.out.println("*****Backward Direction*****");
        while (llt.hasPrevious()){
            System.out.println(llt.previous());
        }
    }
    public static void getElementPgm6(){
        List<String> l=new ArrayList<String>();
        l.add("J");
        l.add("A");
        l.add("V");
        l.add("A");
        String s = l.get(2);//get() takes index as i/p and returns value at the given index to end user
        System.out.println(s);
    }
    public static void compareTwoArrayListsPgm7(){
        List<String> l1=new ArrayList<String>();
        l1.add("JAVA");
        l1.add("TECHIE");
        l1.add("FROGS");
        List<String> l2=new ArrayList<String>();
        l2.add("JAVA");
        l2.add("TECHIE");
        l2.add("FROGS");
        boolean equals = l1.equals(l2);//equals() is over ridden in collection framework for data comparison
        if(equals){
            System.out.println("ArrayLists are Equal");
        }else
        {
            System.out.println("ArrayLists are not Equal");
        }
    }
    public static void concatArrayListsPgm8(){
        List<String> l1=new ArrayList<String>();
        l1.add("JAVA");
        l1.add("TECHIE");
        l1.add("FROGS");
        List<String> l2=new ArrayList<String>();
        l2.add("JAVA");
        l2.add("is a");
        l2.add("Programming Language");
        l1.addAll(l2);
        System.out.println(l1);
    }
    public static void commonDataPgm9(){
        List<String> l1=new ArrayList<String>();
        l1.add("JAVA");
        l1.add("TECHIE");
        l1.add("FROGS");
        List<String> l2=new ArrayList<String>();
        l2.add("JAVA");
        l2.add("is a");
        l2.add("Programming Language");
        l1.retainAll(l2);
        System.out.println(l1);
    }
    public static void duplicatesdisplayPgm10(){
        List<String> l1=new ArrayList<String>();
        l1.add("JAVA");
        l1.add("TECHIE");
        l1.add("FROGS");
        List<String> l2=new ArrayList<String>();
        l2.add("JAVA");
        l2.add("is a");
        l2.add("Programming Language");
        l1.removeAll(l2);
        System.out.println(l1);
    }
    public static void sizeofArrayListPgm11(){
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(10);
        l1.add(10);
        l1.add(5);
        l1.add(17);
        l1.add(1);
        int size = l1.size();
        System.out.println(size);
    }
    public static void clearElementsPgm12(){
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(10);
        l1.add(56);
        l1.add(85);
        l1.add(1);
        int size = l1.size();
        System.out.println(size);
        l1.clear();
        int size1 =l1.size();
        System.out.println(size1);
    }
    public static void immutableArrayListPgm13(){
        List<String> l1=new ArrayList<String>();
        l1.add("J");
        l1.add("A");
        l1.add("V");
        l1.add("A");
        System.out.println(l1);
        List<String> l2 = Collections.unmodifiableList(l1);//makes ArrayList immutable
        l2.add("B");//"UnsupportedOperationException" occurs when u try to add to immutable object
       // System.out.println(l1);
    }
    public static void containsPgm14(){
        List<String> l1=new ArrayList<String>();
        String element="B";
        l1.add("J");
        l1.add("A");
        l1.add("V");
        l1.add("A");
        boolean j = l1.contains(element);
        if(j)
        {
            System.out.println("Element Exist");
        }else
        {
            System.out.println("Element does not Exist");
        }
    }
    public static void removeDuplicatesPgm15(){
        List<String> l1=new ArrayList<String>();
        l1.add("J");
        l1.add("A");
        l1.add("V");
        l1.add("A");
        List<String> l2=new ArrayList<String>();
        for(String temp:l1){
            if(!l2.contains(temp)){
                l2.add(temp);
            }
        }
        System.out.println(l2);
    }
    public static void isEmptyPgm16(){
        List<String> l1=new ArrayList<String>();
        l1.add("J");
        l1.add("A");
        l1.add("V");
        l1.add("A");
        boolean empty = l1.isEmpty();
        if(empty){
            System.out.println("ArrayLIst is Empty");
        }else
        {
            System.out.println("ArrayLIst is not Empty");
        }
    }
    public static void addElementPgm17(){
        ArrayList<String> l1=new ArrayList<String>();
        l1.add("Java");
        l1.add("Techie");
        l1.add("Frogs");
        System.out.println(l1);
        l1.add(1,"Training");
        System.out.println(l1);
    }
    public static void removeElementPgm18(){
        ArrayList<String> l1=new ArrayList<String>();
        l1.add("Java");
        l1.add("Techie");
        l1.add("Frogs");
        l1.remove(0);
        System.out.println(l1);
    }
    public static void replaceElementPgm19(){
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(2);
        l1.add(5);
        l1.add(10);
        System.out.println(l1);
        l1.set(0,50);
        System.out.println(l1);
    }
    public static void sortArrayListPgm20(){
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(2);
        l1.add(5);
        l1.add(10);
        Collections.sort(l1);
        System.out.println(l1);
    }
    public static void cloneArrayListPgm21(){
        ArrayList<Integer> l1=new ArrayList<Integer>();
        l1.add(10);
        l1.add(100);
        l1.add(15);
        l1.add(1);
        ArrayList clone =(ArrayList) l1.clone();
        System.out.println(clone);
    }
    public static void arrayToArrayListPgm22(){
        String[] str={"j","a","v","a"};
        List<String> strings = Arrays.asList(str);
        System.out.println(strings);
    }
    public static void  arrayToArrayListPgm23(){
        String[] str={"j","a","v","a"};
        List<String> al=new ArrayList<String>();
        for(String temp:str)
        {
            al.add(temp);
        }
        System.out.println(al);
    }
    public static void arrayListToArrayPgm24(){
       List<String> l1=new ArrayList<String>();
       l1.add("A");
       l1.add("B");
       l1.add("C");
        Object[] objects = l1.toArray(new String[l1.size()]);
        System.out.println(objects);
    }
    public static void synArrayListPgm25(){
        List<String> l1=new ArrayList<String>();
        l1.add("C");
        l1.add("A");
        l1.add("B");
        List<String> strings = Collections.synchronizedList(l1);
        System.out.println(strings);
    }
    public static void userObjPgm26(){
        List<Emp> l1=new ArrayList<Emp>();
        l1.add(new Emp(10,"A"));
        l1.add(new Emp(20,"B"));
        l1.add(new Emp(30,"C"));
        System.out.println(l1);
        Iterator<Emp> iterator = l1.iterator();
        while(iterator.hasNext())
        {
            Emp e=iterator.next();
            System.out.println(e.getEno()+"-"+e.getEname());
        }
    }
    public static void failfastPgm27(){
        ArrayList<Integer> l1=new ArrayList<Integer>();
        l1.add(10);
        l1.add(10);
        l1.add(10);
        l1.add(null);
        Iterator<Integer> iterator = l1.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
            l1.add(10);//concurrentModificationException
        }
        System.out.println(l1);
    }
    public static void copyOnPgm28(){
        List<String> l1=new CopyOnWriteArrayList();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("d");
        Iterator<String> iterator = l1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            l1.add("A");
        }
        System.out.println(l1);
    }

}
