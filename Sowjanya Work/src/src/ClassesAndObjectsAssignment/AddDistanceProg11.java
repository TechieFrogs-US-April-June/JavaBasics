package ClassesAndObjectsAssignment;

import java.util.Scanner;

class AddDistance {
    private int feet;
    private int inch;

    @Override
    public String toString() {
        return "AddDistance{" +
                "feet=" + feet +
                ", inch=" + inch +
                '}';
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public int readFeet(String count, Scanner sc) {
        while(true) {
            System.out.print("Enter "+count+" distance feet: ");
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                return num;
            } else {
                System.out.println("Invalid distance number. Please enter the distance feet again.");
            }
            sc.nextLine();
        }
    }

    public int readInch(String count, Scanner sc) {
        while(true) {
            System.out.print("Enter "+count+" distance inches: ");
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                if(num<0 || num>=12){
                    System.out.println("Inches should be between 0 and 11. Please enter inches again");
                    continue;
                }
                return num;
            } else {
                System.out.println("Invalid distance number. Please enter the distance inches again.");
            }
            sc.nextLine();
        }
    }
}

public class AddDistanceProg11 {
    public static void main(String[] args) {
        AddDistance d1 = new AddDistance();
        AddDistance d2 = new AddDistance();
        Scanner sc = new Scanner(System.in);
        d1.setFeet(d1.readFeet("first", sc));
        sc.nextLine();
        d1.setInch(d1.readInch("first", sc));
        sc.nextLine();
        d2.setFeet(d2.readFeet("second", sc));
        sc.nextLine();
        d2.setInch(d2.readInch("second", sc));
        System.out.println("Distance d1: "+d1);
        System.out.println("Distance d2: "+d2);

        AddDistance d = addDistance(d1, d2);
        System.out.println("Sum of d1 and d2 distance: "+d);
        sc.close();
    }
    public static AddDistance addDistance(AddDistance d1, AddDistance d2) {
        AddDistance d = new AddDistance();
        int tot_feet = d1.getFeet() + d2.getFeet();
        int tot_inch = d1.getInch() + d2.getInch();

        if(tot_inch >= 12) {
            tot_feet++;
            tot_inch = tot_inch - 12;
        }
        d.setFeet(tot_feet);
        d.setInch(tot_inch);
        return d;
    }
}
