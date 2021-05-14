package Methods;

public class Student {
    String name="unknown";
    int age=0;
    String address="not available";

    Student(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;

        System.out.println("In Constructor name is : "+name+ " age is : "+age+ " address is : "+address);
    }

    public void setInfo(String name,int age){
       // name="Ram";
        //age=30;
        //System.out.println("In first setInfo method Name is : "+name+ "age is : "+age);
    }
    public void setInfo(String name,int age,String address){
      //name="Shyam";
      //age=40;
      //address="New York";
      System.out.println("In Overloading setInfo method Name is :"+name+" age is : "+age+" address is : "+address);
    }
    
    public static void main(String[] args) {
        Student s = new Student("Sia", 20,"Canada");
        s.setInfo("Ria", 27);
        s.setInfo("Rosie", 28, "Australia");

    }
}
