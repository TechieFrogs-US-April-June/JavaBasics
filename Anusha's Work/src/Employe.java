public class Employe {
    int eno;
    String ename;
    Address address;
    public  Employe(int eno,String ename,Address addr){
        this.eno=eno;
        this.ename=ename;
        this.address=addr;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
