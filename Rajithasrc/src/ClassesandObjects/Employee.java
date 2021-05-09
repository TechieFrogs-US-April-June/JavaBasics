package ClassesandObjects;
public class Employee {
    String Name;
    int Yearofjoining;
    String Address;
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.Name = "John";
        e1.Yearofjoining= 1994;
        e1.Address = "64C-WallsStreat";

        Employee e2 = new Employee();
        e2.Name = "Sam";
        e2.Yearofjoining= 2000;
        e2.Address = "68D-WallsStreat";

        Employee e3 = new Employee();
        e3.Name = "John";
        e3.Yearofjoining= 1999;
        e3.Address = "26B-WallsStreat";

        System.out.println("Name          "+"Year of joining       "+"Address");

        System.out.println(e1.Name+"            "+e1.Yearofjoining+"               "+e1.Address);
        

        System.out.println(e2.Name+"             "+e2.Yearofjoining+"               "+e2.Address);
        

        System.out.println(e3.Name+"            "+e3.Yearofjoining+"               "+e3.Address);
        

    }
}
