package src.InterfacesExercises;

public interface Measurable {

    default double getMeasure(){
     double measure =20;
    return measure;
    }
    
}

class Employee implements Measurable{

    double average;{

    }
}
