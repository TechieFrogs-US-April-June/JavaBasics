public class Driver {
    public static void main(String[] args) {
        Address addObj=new Address(851,"West Lane");
        Employe emObj=new Employe(1,"ABC",addObj);
        System.out.println(emObj.eno+"---"+emObj.ename);
        System.out.println(emObj.address.getHno()+"----"+emObj.address.getLoc());
    }
}
