package Methods;

class Degree{

    public void getDegree(){
        System.out.println("I got a degree");
    }
}

class UnderGraduate extends Degree{
    public void getDegree(){
        System.out.println("I am an UnderGraduate");
    }
}

class PostGraduate extends Degree{
    public void getDegree(){
        System.out.println("I am a PostGraduate");
    }
}
public class MethodSample3 {
    public static void main(String[] args) {
        
     Degree d = new Degree();
     d.getDegree();   
    
    UnderGraduate ug = new UnderGraduate();
    ug.getDegree();

    PostGraduate pg = new PostGraduate();
    pg.getDegree();


    
    }

    
   
    
}
