package ListQA;

import java.util.*;

public class ListAssignments {
    public static void main(String[] args) {
        //addElePgm1();
        //removeduplicPgm2();
        //revArrayListPgm3();
        //mergeArrayListPgm4();
        //elementPgm5();
        //removeElePgm6();
        //replaceElePgm7();
       // compareArrayListPgm8();
        //copyArrayListPgm9();
        //arrayToArrayListPgm10();
        arrayLiStToArrayPgm11();
    }

    public static void addElePgm1() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        System.out.println(l1);
    }

    public static void removeduplicPgm2() {
        List<String> l1 = new ArrayList<String>();
        l1.add("Java");
        l1.add("Techie");
        l1.add("Java");
        l1.add("Frogs");
        List<String> l2 = new ArrayList<String>();
        for (String temp : l1) {
            if (!l2.contains(temp)) {
                l2.add(temp);
            }
        }
        System.out.println(l2);
    }

    public static void revArrayListPgm3() {
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        System.out.println("Original ArrayList:" + l1);
        //System.out.println(l1.size());
        for (int i = l1.size() - 1; i >= 0; i--) {
            //System.out.println(l1.get(i));
            l2.add(l1.get(i));
        }
        System.out.println("Reversed ArrayList:" + l2);
    }

    public static void mergeArrayListPgm4() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(5);
        l2.add(15);
        l2.add(25);
        l2.add(35);
        l1.addAll(l2);
        System.out.println(" " + l1);


    }

    public static void elementPgm5() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(60);
        l1.add(80);
        l1.add(50);
        int element = 600;
        boolean contains = l1.contains(element);
        if (contains) {
            System.out.println("Element Exist");
        } else {
            System.out.println("Element does not Exist");
        }
    }
    public static void replaceElePgm7(){
        List<String> l1=new ArrayList<String>();
        l1.add("Java");
        l1.add("Techie");
        l1.add("Frogs");
        System.out.println(l1);
        l1.set(2,"FROGS");
        System.out.println(l1);
    }
    public static void compareArrayListPgm8(){
        List<String> l1=new ArrayList<String>();
        l1.add("Java");
        l1.add("Techie");
        l1.add("Frogs");
        List<String> l2=new ArrayList<String>();
        l2.add("Java");
        l2.add("Techie");
        l2.add("Frogs");
        boolean equals = l1.equals(l2);
        if(equals){
            System.out.println("Two ArrayLIsts Are Equal");
        }else{
            System.out.println("Two ArrayLIsts Are not Equal");
        }
    }
    public static void removeElePgm6(){
        List<String> l1=new ArrayList<String>();
        l1.add("Java");
        l1.add("Techie");
        l1.add("Frogs");
        System.out.println(l1);
        l1.remove(0);
        System.out.println(l1);
    }
    public static void copyArrayListPgm9(){
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        List<Integer> l2=new ArrayList<Integer>();
        for(int i=0;i<l1.size()-1;i++){
            l2.add(l1.get(i));
        }
        System.out.println(l2);
    }
    public static void arrayToArrayListPgm10(){
        Integer[] i={10,20,30,40};
        List<Integer> integerArrayList = Arrays.asList(i);
        System.out.println(integerArrayList);
    }
    public static void arrayLiStToArrayPgm11(){
        List<String> l1=new ArrayList<String>();
        l1.add("Java");
        l1.add("techie");
        Object[] objects = l1.toArray(new String[l1.size()]);
        System.out.println(objects);
    }
}
