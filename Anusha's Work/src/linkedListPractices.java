import java.util.*;

public class linkedListPractices {
    public static void main(String[] args) {
        //linkedListDefPgm1();
       // nullDuplicatesPgm2();
        //iterationUsingForEachPgm3();
       // iterationPgm4();
        //listIteratorPgm5();
        //getElementPgm6();
        //compareLinkedListsPgm7();
        //concatLinkedListsPgm8();
        //commondataPgm9();
        //duplicatePgm10();
        //sizePgm11();
        //clearPgm12();
        //immutablePgm13();
        //containsPgm14();
        //duplicatesPgm15();
        //isEmptypgm16();
        //addElementPgm17();
        //removeElementPgm18();
        //replaceElementPgm19();
        //sortLinkedListPgm20();
        //clonePgm21();
        //arrayToLinkedListPgm22();
        //arrayToLinkedListPgm23();
        //LinkedListToArrayPgm24();
        //synLinkedListPgm25();
        //userObjPgm26();
       // failFastPgm27();
    }
    public static void linkedListDefPgm1(){
        List<Integer> ll1=new LinkedList<Integer>();
        ll1.add(10);
        ll1.add(10);
        ll1.add(null);
        System.out.println(ll1);
    }
    public static void nullDuplicatesPgm2(){
        List<String> l1=new LinkedList<>();
        l1.add("a");
        l1.add("a");
        l1.add(null);
        System.out.println(l1);
    }
    public static void iterationUsingForEachPgm3(){
        List<Integer> l1=new LinkedList<Integer>();
        l1.add(10);
        l1.add(1);
        l1.add(100);
        l1.add(20);
        for(Integer temp:l1){
            System.out.println(temp);
        }
    }
    public static void iterationPgm4(){
        LinkedList<Integer> l1=new LinkedList<Integer>();
        l1.add(2);
        l1.add(22);
        l1.add(200);
        l1.add(20);
        Iterator<Integer> iterator = l1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void listIteratorPgm5(){
        LinkedList<Integer> l1=new LinkedList<Integer>();
        l1.add(12);
        l1.add(20);
        l1.add(50);
        l1.add(90);
        ListIterator<Integer> integerListIterator = l1.listIterator();
        System.out.println("*****Forward Direction*****");
        while(integerListIterator.hasNext()){
            System.out.println(integerListIterator.next());
        }
        System.out.println("*****Backward Direction*****");
        while(integerListIterator.hasPrevious()){
            System.out.println(integerListIterator.previous());
        }
    }
    public static void getElementPgm6(){
        LinkedList<Integer> l1=new LinkedList<Integer>();
        l1.add(12);
        l1.add(20);
        l1.add(50);
        l1.add(90);
        Integer integer = l1.get(2);
        System.out.println(integer);
    }
    public static void compareLinkedListsPgm7(){
        LinkedList<String> l1=new LinkedList<String>();
        l1.add("java/");
        l1.add("Collections");
        LinkedList<String> l2=new LinkedList<String>();
        l2.add("java/");
        l2.add("Collections/");
        l2.add("LinkedList");
        boolean equals = l1.equals(l2);
        if(equals){
            System.out.println("LinkedLists are equal");
        }else{
            System.out.println("LinkedLists are not equal");
        }
    }
    public static void concatLinkedListsPgm8(){
        List<String> l1=new LinkedList<String>();
        l1.add("JAVA");
        l1.add("Collections");
        List<String> l2=new LinkedList<String>();
        l2.add("java");
        l2.add("collections");
        l1.addAll(l2);
        System.out.println(l1);
    }
    public static void commondataPgm9(){
        List<String> l1=new LinkedList<String>();
        l1.add("JAVA");
        l1.add("Collections");
        List<String> l2=new LinkedList<String>();
        l2.add("JAVA");
        l2.add("collections");
        l1.retainAll(l2);
        System.out.println(l1);
    }
    public static void duplicatePgm10(){
        List<String> l1=new LinkedList<String>();
        l1.add("JAVA");
        l1.add("Collections");
        List<String> l2=new LinkedList<String>();
        l2.add("JAVA");
        l2.add("collections");
        l1.removeAll(l2);
        System.out.println(l1);
    }
    public static void sizePgm11(){
        List<String> l1=new LinkedList<String>();
        l1.add("JAVA");
        l1.add("Collections");
        int size = l1.size();
        System.out.println(size);
    }
    public static void clearPgm12(){
        List<String> l1=new LinkedList<String>();
        l1.add("JAVA");
        l1.add("Collections");
        l1.clear();
        System.out.println(l1.size());
    }
    public static void immutablePgm13(){
        List<Integer> l1=new LinkedList<Integer>();
        l1.add(23);
        l1.add(58);
        l1.add(null);
        List<Integer> integers = Collections.unmodifiableList(l1);
        integers.add(25);
    }
    public static void containsPgm14(){
        List<String> l1=new LinkedList<String>();
        l1.add("JAVA");
        l1.add("Collections");
        String element="java";
        boolean contains = l1.contains(element);
        if(contains){
            System.out.println("Element Exists");
        }else{
            System.out.println("Element does not Exists");
        }
    }
    public static void duplicatesPgm15(){
        List<String> l1=new LinkedList<String>();
        l1.add("JAVA");
        l1.add("Collections");
        l1.add(null);
        l1.add("JAVA");
        List<String> l2=new LinkedList<String>();
        for(String temp:l1){
            if(!l2.contains(temp)){
                l2.add(temp);
            }
        }
        System.out.println(l2);
    }
    public static void isEmptypgm16(){
        List<String> l1=new LinkedList<String>();
        l1.add("JAVA");
        l1.add("Collections");
        l1.add(null);
        l1.add("JAVA");
        l1.clear();
        boolean empty = l1.isEmpty();
        if(empty){
            System.out.println("List Object Is Empty");
        }else{
            System.out.println("List Object Is not Empty");
        }
    }
    public static void addElementPgm17(){
        List<String> l1=new LinkedList<>();
        l1.add("JAVA");
        l1.add("Collections");
        l1.add(null);
        l1.add("JAVA");
        l1.add(3,"Programming");
        System.out.println(l1);
    }
    public static void removeElementPgm18(){
        List<String> l1=new LinkedList<String>();
        l1.add("JAVA");
        l1.add("Collections");
        l1.add(null);
        l1.add("JAVA");
        l1.remove(3);
        System.out.println(l1);
    }
    public static void replaceElementPgm19(){
        List<String> l1=new LinkedList<String>();
        l1.add("JAVA");
        l1.add("Collections");
        l1.add(null);
        l1.add("JAVA");
        l1.set(3,"Topics");
        System.out.println(l1);
    }
    public static void sortLinkedListPgm20(){
        LinkedList<Integer> l1=new LinkedList<Integer>();
        l1.add(12);
        l1.add(20);
        l1.add(50);
        l1.add(90);
        Collections.sort(l1);
        System.out.println(l1);
    }
    public static void clonePgm21(){
        LinkedList<Integer> l1=new LinkedList<Integer>();
        l1.add(12);
        l1.add(20);
        l1.add(50);
        l1.add(90);
        LinkedList clone =(LinkedList) l1.clone();
        System.out.println(clone);
    }
    public static void arrayToLinkedListPgm22(){
        String[] str={"j","a","v","a"};
        List<String> strings = Arrays.asList(str);
        System.out.println(strings);
    }
    public static void arrayToLinkedListPgm23(){
        String[] str={"j","a","v","a"};
        List<String> l1=new LinkedList<String>();
        for(String temp:str){
            l1.add(temp);
        }
        System.out.println(l1);
    }
    public static void LinkedListToArrayPgm24(){
        List<String> l1=new LinkedList<String>();
        l1.add("JAVA");
        l1.add("Collections");
        l1.add(null);
        l1.add("JAVA");
        l1.set(3,"Topics");

        Object[] objects = l1.toArray(new String[l1.size()]);
        for (int i = 0; i < objects.length; i++)
        {
            System.out.println(objects[i]);
        }
    }
    public static void synLinkedListPgm25(){
        List<String> l1=new LinkedList<String>();
        l1.add("JAVA");
        l1.add("Collections");
        l1.add(null);
        l1.add("JAVA");
        List<String> strings = Collections.synchronizedList(l1);
        System.out.println(strings);
    }
    public static void userObjPgm26(){
        List<Emp> l1=new LinkedList<Emp>();
        l1.add(new Emp(10,"a"));
        l1.add(new Emp(20,"b"));
        l1.add(new Emp(30,"c"));
        Iterator<Emp> iterator = l1.iterator();
        while(iterator.hasNext()) {
            Emp e= iterator.next();
            System.out.println(e.getEno()+"-"+e.getEname());
        }
    }
    public static void failFastPgm27(){
        List<String> l1=new LinkedList<String>();
        l1.add("JAVA");
        l1.add("Collections");
        l1.add(null);
        l1.add("JAVA");
        l1.set(3,"Topics");
        Iterator<String> iterator = l1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            l1.add("ABC");//concurrent Modification Exception occurs
        }
    }

}
