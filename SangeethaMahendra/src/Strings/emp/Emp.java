package src.Strings.emp;

public class Emp {
    String ename;
    int eno;
    public Emp(){
        eno = 10;
        ename = "Isha";
    }
    public void disp(){
        System.out.println(eno + " " + ename);
    }

    // To Override ToString method
    public String toString(){
          return eno + " " + ename;
    }
}
