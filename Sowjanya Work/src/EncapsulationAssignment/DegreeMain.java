package EncapsulationAssignment;

class Degree {
    public void getDegree() {
        System.out.println("I got a Degree");
    }
}

class Undergraduate extends Degree {
    public void getDegree() {
        System.out.println("I got an Undergraduate");
    }
}

class Postgraduate extends Degree {
    public void getDegree() {
        System.out.println("I got a Postgraduate");
    }
}

public class DegreeMain {
    public static void main(String[] args) {
        Degree degreeObj = new Degree();
        Undergraduate underObj = new Undergraduate();
        Postgraduate postObj = new Postgraduate();
        degreeObj.getDegree();
        underObj.getDegree();
        postObj.getDegree();
    }
}
