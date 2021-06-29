package src.AbstractExercises;
//Q3
abstract class Marks {
    abstract double getPercentage();
    
}

class A extends Marks{
   double subject1,subject2,subject3, subject4,sum, percentage;

double getPercentage(){
       sum = subject1 + subject2 + subject3;
       percentage = (sum/300) * 100;
       return percentage; 
  }

   public A(double subject1, double subject2, double subject3 ){
       this.subject1 = subject1;
       this.subject2 = subject2;
       this.subject3 = subject3;
       System.out.println("Subject1 " + subject1);
       System.out.println("Subject2 " + subject2);
       System.out.println("Subject3 " + subject3);
  }
}

class B extends Marks{
    double subject1,subject2,subject3, subject4,sum,calculate, percentage;
double getPercentage(){
    sum = subject1 + subject2 + subject3 + subject4;
    percentage = (sum/400) * 100;
    return percentage;
  }
  public B(double subject1, double  subject2, double  subject3, double subject4 ){
    this.subject1 = subject1;
    this.subject2 = subject2;
    this.subject3 = subject3;
    this.subject4 = subject4;
    System.out.println("Subject1 " + subject1);
    System.out.println("Subject2 " + subject2);
    System.out.println("Subject3 " + subject3);
    System.out.println("Subject4 " + subject4);
    
}
}

class MyAbstract1{
    public static void main(String[] args) {
        A aObj = new A(80,85,90);
        aObj.getPercentage();
        System.out.println("Sum of Three subjects are  " +aObj.sum);
        System.out.println("The percentage of marks " + aObj.percentage);

        B bObj = new B(90,95,92,94);
        bObj.getPercentage();
        System.out.println("Sum of Three subjects are  " +bObj.sum);
     System.out.println("The percentage of marks " + bObj.percentage);

        
    }
}