package BeginnersAssignment.AggregationHasARelation;

public class StudentDependent {
    int rollNum;
    String studentName;

    //Creating HAS-A relationship with Address class
    AddressIndependent studentAddr;

    StudentDependent(int roll, String name, AddressIndependent addr) {
        this.rollNum = roll;
        this.studentName = name;
        this.studentAddr = addr;
    }
}
