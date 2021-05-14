package SirishaWork.src.ClassesAndObjects;

public class AddTwoDistance {
        public static void main(String[] s) {
            try {

                AddDistance D1 = new AddDistance();
                AddDistance D2 = new AddDistance();
                AddDistance D3 = new AddDistance();

                //read first distance
                System.out.println("Enter first distance: ");
                D1.getDistance();

                //read second distance
                System.out.println("Enter second distance: ");
                D2.getDistance();

                //add distances
                D3.addDistance(D1, D2);
                //print distance
                System.out.println("Total distance is:");
                D3.showDistance();
            } catch (Exception e) {
                System.out.println("Exception occurred :" + e.toString());
            }
        }
    }

