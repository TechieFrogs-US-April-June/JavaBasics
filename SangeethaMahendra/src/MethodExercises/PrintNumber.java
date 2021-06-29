package src.MethodExercises;
//Q1. Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods with the same name 'printn' having a parameter for each datatype.


public class PrintNumber {
    
    void println(String PatientName){
       System.out.println("Patient Name : " + PatientName);
    }
    void println(int PatientNumber){
        System.out.println("Patient Number : " + PatientNumber);
    }
    void println(double CoPay){
        System.out.println("Patient Co pay : " +  CoPay );
    }
    void println(float temp){
        System.out.println("Patient temp : " +  temp );
    }

    void println(double height, double weight){
        System.out.println("Patient Height : " +  height );   
        System.out.println("Patient Weight : " +  weight ); 
    }
    public static void main(String[] args) {
        PrintNumber obj = new PrintNumber();
        obj.println("raj");
        obj.println(12);
        obj.println(20.0);
        obj.println(98.5);
        obj.println(5.2, 75.5);
        
    }
    
}
