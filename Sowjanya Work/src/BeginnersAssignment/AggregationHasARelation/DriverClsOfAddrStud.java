package BeginnersAssignment.AggregationHasARelation;

public class DriverClsOfAddrStud {

    public static void main(String args[]){
        AddressIndependent ad = new AddressIndependent(55, "Agra", "UP", "India");
        StudentDependent obj = new StudentDependent(123, "sowji", ad);
        System.out.println(obj.rollNum);
        System.out.println(obj.studentName);
        System.out.println(obj.studentAddr.streetNum);
        System.out.println(obj.studentAddr.city);
        System.out.println(obj.studentAddr.state);
        System.out.println(obj.studentAddr.country);
    }

}
