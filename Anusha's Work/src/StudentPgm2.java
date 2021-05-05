public class StudentPgm2 {
    int rollno,phoneno;
    String name,address;

    void insertDetails(int rno,String stuname,String addr,int phno) {
         rollno=rno;
         name=stuname;
         address=addr;
        phoneno=phno;
    }
    void display()
    {
        System.out.println(" RollNumber:"+rollno);
        System.out.println(" Name:"+name);
        System.out.println(" Address:"+address );
        System.out.println(" Phone No:"+phoneno);
    }
    public static void main(String[] args) {
        StudentPgm2 s1=new StudentPgm2();
        StudentPgm2 s2=new StudentPgm2();

        s1.insertDetails(1,"Sam","212,west Lane",123456789);
        s2.insertDetails(2,"John","547,East Lane",785463214);
        s1.display();
        s2.display();

    }
}
