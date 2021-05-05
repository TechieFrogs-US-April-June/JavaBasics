public class Employee {
    String name,address;
    int yearofjoining;
    float salary;

    void insertDetails(String empname,String adr,int year,float sal) {
        name=empname;
        address=adr;
        yearofjoining=year;
        salary=sal;
    }
    void display(){
        System.out.println(name+"         "   + yearofjoining +"           "+address);
    }
    public static void main(String[] args) {
        Employee empObj=new Employee();
        empObj.insertDetails("Robert","64C- WallsStreat",1994,72000);
        Employee empObj1=new Employee();
        empObj1.insertDetails("Sam","68D- WallsStreat",2000,90000);
        Employee empObj2=new Employee();
        empObj2.insertDetails("John","26B- WallsStreat",1999,100000);
        System.out.println("Name"+"       " + "Year of Joining"+ "        " + "Address");
        empObj.display();
        empObj1.display();
        empObj2.display();



    }
}
