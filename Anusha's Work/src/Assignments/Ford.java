package Assignments;

class CarClass1
{
    public int speedLimit()
    {
        return 100;
    }
}
class Ford extends CarClass1
{
    public int speedLimit()
    {
        return 150;
    }
    public static void main(String args[])
    {
        CarClass1 obj = new Ford();
        int num= obj.speedLimit();
        System.out.println("Speed Limit is: "+num);
    }
}
