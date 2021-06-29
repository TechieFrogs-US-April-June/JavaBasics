package InterfaceSamples;

interface Measurable{
    double average();
}

class Employee implements Measurable{
    private int employeeId=01;
    private String employeeName="Ram";
    private double salary=50000.00;
    //private double netSalary;

    
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    //private void setNetSalary(double netSalary){
        //this.netSalary = netSalary;
   // }

    
    public int getEmployeeId(){
        return employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public double getSalary(){
        return salary;
    }

   // public double getNetSalary(){
       // return netSalary;
   // }

    
    //public void calculateNetSalary (double pfPercentage){
      //  double pfAmount = salary * (pfPercentage / 100);
        //double netSalary = salary - pfAmount;
        //this.setNetSalary(netSalary);
    //}
    public double average(){

        return 0;

    }
}
public class InterfaceSample6  {
    
    public static void main(String[] args) {
        Employee empobj = new Employee();
        //empobj.setEmployeeId(05);
        //empobj.setEmployeeName("Vignesh");
        //empobj.setSalary(50000.00);
        System.out.println("Employee Id is : "+empobj.getEmployeeId()+" Employee name is : " +empobj.getEmployeeName()+"  Employee Salary is "+empobj.getSalary());
        
    }
    
}
