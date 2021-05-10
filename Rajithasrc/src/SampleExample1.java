class Exam{
     int i,j;
     
    String abc;

      Exam(int x,int y){
  
     this(3,"BoardExam");
        i=x;
        j=y;
        System.out.println("First Constructor");
     }
      Exam(int x,String s){
         //this(7,4);
         i=x;
         abc=s;
        System.out.println("Second Constructor");
     }
     Exam(){
         
         System.out.println("Atleast one constructor");
     }

     protected void method2(){
         System.out.println("Display method of class Exam");
     }

}
public class SampleExample1 {
    
   public SampleExample1(){
    
        System.out.println("Default Constructor");
    }
  
    private void method3(){
        System.out.println("private method of class SampleExample1");
    }
    
    public static void main(String[] args){

        int t=8;
        System.out.println(t);

        Exam examObj= new Exam(30,40);
        System.out.println(examObj.i+" "+examObj.j);

        Exam examObj1= new Exam(60,"name");
        System.out.println(examObj1.i+" "+examObj1.abc);

        Exam examObj3 = new Exam();

        examObj.method2();

        SampleExample1 sampleexeObj= new SampleExample1();
        sampleexeObj.method3();



    }
}
