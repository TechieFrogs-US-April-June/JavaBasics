package src.Strings.emp;

public class driver {
    public static void main(String[] args) {
        Emp e = new Emp(); // object created for Emp class; values stored in heap area;
        //whenever complier will call e.ToString(); ToString method is a part of Object
        //To print the actual output i.e (eno:10,ename:"sunil"), have to override Tostring method in emp class; check Emp class
        System.out.println(e); // output is a reference variable address (src.Strings.emp.Emp@36baf30c)
        
        e.disp(); // it is pointing to heap area for emp disp() method

        // String with parameterized Value, the preference will give to constructor
        String s = new String("Meena"); 
        System.out.println(s);  // output is Meena


        // String using Pre-defined method length
        System.out.println(s.length());
    }
    
}
