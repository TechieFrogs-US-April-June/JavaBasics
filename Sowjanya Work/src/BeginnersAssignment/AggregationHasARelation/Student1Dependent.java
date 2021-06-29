package BeginnersAssignment.AggregationHasARelation;

public class Student1Dependent {
    int rollNum;
    String studentName;
    //Creating HAS-A relationship with Address class
    Address1Independent studentAddr;
    Student1Dependent(int roll, String name, Address1Independent addr) {
        this.rollNum = roll;
        this.studentName = name;
        this.studentAddr = addr;
    }
}
