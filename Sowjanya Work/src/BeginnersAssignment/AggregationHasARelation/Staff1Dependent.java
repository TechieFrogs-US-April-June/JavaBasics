package BeginnersAssignment.AggregationHasARelation;

public class Staff1Dependent {
    String employeeName;
    //Creating HAS-A relationship with Address class
    Address1Independent employeeAddr;
    Staff1Dependent(String name, Address1Independent addr){
        this.employeeName = name;
        this.employeeAddr = addr;
    }
}
