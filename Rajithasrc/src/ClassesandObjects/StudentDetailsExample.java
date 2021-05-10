package ClassesandObjects;
class Student11{
    String str1="Sam";
    String str2="John";
    String addr1,addr2,phno1,phno2;
    int rollno1,rollno2;
}

class StudentDetailsExample{
    
     public static void main(String[] args) {
        Student11 s1 = new Student11();
        Student11 s2 =new Student11();
        s1.addr1="Singapore";
        s1.rollno1=2;
        s1.phno1="6538933424";
        s2.addr2="Australia";
        s2.rollno2=3;
        s2.phno2="6389797933";
        System.out.println(s1.str1+" "+s1.rollno1+" "+s1.phno1+" "+s1.addr1);
        System.out.println(s2.str2+" "+s2.rollno2+" "+s2.phno2+" "+s2.addr2);

    }

}