package SirishaWork.src.ClassesAndObjects;

class Students{
    String address;
    String name;
    int rollno;
    long phoneno;


    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "sirisha";
        s1.rollno = 2;
        s1.phoneno = 4536789088L;
        s1.address = "660 bundy ave";

        Students s2 = new Students();
        s2.name = "Sam";
        s2.rollno = 13;
        s2.phoneno = 3455679800L;
        s2.address = "540 ardis ave";

        System.out.println("The name is: "+ s1.name+'\n' +"roll number is: "+s1.rollno+'\n' +"phone no is: "+s1.phoneno + '\n' +"Address is: "+s1.address);
        System.out.println("The name is: "+s2.name +'\n'+"roll number is : "+s2.rollno +'\n' +"phone no is: "+s2.phoneno +'\n' +"Address is: "+s2.address);
    }
}
