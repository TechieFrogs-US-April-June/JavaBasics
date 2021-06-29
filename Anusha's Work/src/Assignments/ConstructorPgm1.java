package Assignments;

public class ConstructorPgm1 {
        int empId;
        String empName;
        ConstructorPgm1(int id, String name){
            this.empId = id;
            this.empName = name;
        }
        void disp(){
            System.out.println("Id: "+empId+" Name: "+empName);
        }

        public static void main(String args[]){
            ConstructorPgm1 obj1 = new ConstructorPgm1(456,"Java");
            ConstructorPgm1 obj2 = new ConstructorPgm1(123,"Techie");
            obj1.disp();
            obj2.disp();
        }
    }
