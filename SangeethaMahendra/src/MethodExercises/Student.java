package src.MethodExercises;

public class Student {

    String name;
    int age;
    String Address;

    
      Student() {
        name = "unknown";
        age = 0;
        Address = "Not available";
        System.out.println("In the Constructor name : "+name+ " age : "+age+ " address  : "+Address);
    }
    void setInfo(String name, int age){
        System.out.println("In the Method name : "+name+ " age : "+age);

    }

    void setInfo(String name, int age, String Address){
        System.out.println("In the Over Loading Method name  : "+name+ " age  : "+age+ " address  : "+Address);
    }


    public static void main(String[] args) {
        Student sc = new Student();
        sc.setInfo("Raj", 8);
        sc.setInfo("Maha", 8, "5,Gandhi street");
    //     Student []arr = new Student[10];
    //     arr[0].setInfo("Sakthi",8,"6,One Road"); 
    //     arr[1].setInfo("Sakshi",9,"7,two Road"); 
    //     arr[2].setInfo("Saha",7,"5,3rd Road");
    //     arr[3].setInfo("Sara",4,"4,4th Road");
    //     arr[4].setInfo("Susi",6,"3,5th Road");
    //     arr[5].setInfo("Anya",2,"2,6th Road");
    //     arr[6].setInfo("Aysha",10,"1,7th Road");
    //     arr[7].setInfo("sami",5,"7,8th Road");
    //     arr[8].setInfo("Shilpa",3,"8,9th Road");
    //     arr[9].setInfo("Kandha",4,"10,10th Road");
     }
    
}
