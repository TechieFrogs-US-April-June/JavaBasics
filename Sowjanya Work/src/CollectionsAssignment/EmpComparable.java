package CollectionsAssignment;

public class EmpComparable implements Comparable<EmpComparable>{
    private int eno;
    private String ename;
    private String eadd;

    public EmpComparable()
    {

    }

    public EmpComparable(int eno, String ename, String eadd) {
        this.eno = eno;
        this.ename = ename;
        this.eadd = eadd;
    }

    public EmpComparable(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "EmpComparable{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                '}';
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

    public String getEadd() {
        return eadd;
    }

    public void setEadd(String eadd) {
        this.eadd = eadd;
    }

    //Comparing with eno
    /*@Override
    public int compareTo(EmpComparable e) {

        if(this.eno > e.getEno())
            return 1;
        else if(this.eno < e.getEno())
            return -1;
        else
        return 0;
    }*/

    //Comparing with ename
    @Override
    public int compareTo(EmpComparable e) {
        return this.ename.compareTo(e.getEname());
    }



}
