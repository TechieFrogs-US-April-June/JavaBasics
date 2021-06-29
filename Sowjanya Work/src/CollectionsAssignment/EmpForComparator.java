package CollectionsAssignment;

public class EmpForComparator {
    private int eno;
    private String ename;

    public EmpForComparator(){}

    public EmpForComparator(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "EmpForComparator{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                '}';
    }
}
