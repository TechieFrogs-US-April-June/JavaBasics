package BeginnersAssignment.GarbageCollection;

public class GarbageExample {

    public static void main(String[] args) {
        GarbageExample obj = new GarbageExample();
        obj = null;

        GarbageExample a = new GarbageExample();
        GarbageExample b = new GarbageExample();

        b = a;
        System.gc();

        /*protected void finalize() throws Throwable
        {
            System.out.println("Garbage collection is performed by JVM");
        }*/
    }
}
