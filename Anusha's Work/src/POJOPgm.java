 class EmployeeA{
    int eno;
    String empname;

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }
}


public class POJOPgm {
    public static void main(String[] args) {
        EmployeeA empObjA=new EmployeeA();
        empObjA.setEno(1);
        empObjA.setEmpname("ABC");
        System.out.println(empObjA.getEno());
        System.out.println(empObjA.getEmpname());

    }
}
