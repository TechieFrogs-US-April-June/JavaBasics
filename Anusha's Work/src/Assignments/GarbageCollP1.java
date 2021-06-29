package Assignments;

public class GarbageCollP1 {
    public static void main(String args[]){
        GarbageCollP1 obj=new GarbageCollP1();
        obj=null;
        GarbageCollP1 a = new GarbageCollP1();
        GarbageCollP1 b = new GarbageCollP1();
        b = a;
        System.gc();
    }
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collection is performed by JVM");
    }
}
