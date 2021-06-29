public class ToStringDemo {
    int rollno;
    String name;
    String city;
   
    ToStringDemo(int no,String sname,String scity){
        rollno=no;
        name=sname;
        city=scity;

    }

    public String toString(){
        return name+" "+rollno+" "+city;
    }
    public static void main(String[] args) {

        ToStringDemo tostringdemoobj1 = new ToStringDemo(5, "Bharat", "Hyd");
        ToStringDemo tostringdemoobj2 = new ToStringDemo(10, "sirat", "Hyd");
        //System.out.println(tostringdemoobj1.city+"  "+tostringdemoobj1.name+" "+tostringdemoobj1.rollno);
        //System.out.println(tostringdemoobj2.city+"  "+tostringdemoobj2.name+" "+tostringdemoobj2.rollno);
        System.out.println(tostringdemoobj1);
        System.out.println(tostringdemoobj2);
        System.out.println(tostringdemoobj1);
        System.out.println(tostringdemoobj1);
    }

}
