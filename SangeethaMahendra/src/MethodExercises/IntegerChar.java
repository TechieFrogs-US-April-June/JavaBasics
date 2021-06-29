package src.MethodExercises;

//Q2 : Integer and Charcter
class print{
    
  void display(int n , char c){
    System.out.println("Print Number and Character  "+n+"     "+c);
  }
 
  void display(char c, int n){
    System.out.println("Print Character and Number "+c+"     "+n);
  }
}



public class IntegerChar {
    public static void main(String[] args) {
        print obj = new print();
        obj.display(1, 'A');
        obj.display('B', 2);

        
    }
}
