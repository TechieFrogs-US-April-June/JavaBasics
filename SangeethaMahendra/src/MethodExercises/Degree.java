package src.MethodExercises;

public class Degree {

    void getDegree(){
        System.out.println("I got a degree");
    }
}

    class Undergraduate {
    void getdegree(){
            System.out.println("I am an Undergraduate");
            
        }

    }
    class Postgraduate {
     void getdegree(){
            System.out.println("I am a Postgraduate");
        }

    }

    class display  {
    public static void main(String[] args) {
           Degree dObj = new Degree();
           dObj.getDegree();

           Undergraduate uObj = new Undergraduate();
           uObj.getdegree();

           Postgraduate pObj = new Postgraduate();
           pObj.getdegree();
        
    }
    
    }
    

