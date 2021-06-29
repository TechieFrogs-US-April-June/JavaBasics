package BeginnersAssignment.AggregationHasARelation;

public class College1Dependent {
    String collegeName;
    //Creating HAS-A relationship with Address class
    Address1Independent collegeAddr;
    College1Dependent(String name, Address1Independent addr){
        this.collegeName = name;
        this.collegeAddr = addr;
    }
}
