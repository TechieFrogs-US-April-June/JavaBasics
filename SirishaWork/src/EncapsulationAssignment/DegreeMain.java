package SirishaWork.src.EncapsulationAssignment;

class Degree {
    public void getDegree() {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree {
    public void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

    class Postgraduate extends Degree {
        public void getDegree() {
            System.out.println("I am a Postgraduate");
        }
    }

    public class DegreeMain {
        public static void main(String[] args) {
            Degree degreeobj = new Degree();
            Undergraduate underobj = new Undergraduate();
            Postgraduate postgradobj = new Postgraduate();
            degreeobj.getDegree();
            underobj.getDegree();
            postgradobj.getDegree();
        }
    }

