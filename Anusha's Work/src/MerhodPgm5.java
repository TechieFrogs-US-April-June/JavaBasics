class Degree{
    void getDegree(){
        System.out.println("I got a Degree");
    }
}
class Undergraduate{
    void getDegree(){
        System.out.println("I am an UnderGraduate");
    }
}
class Postgraduate{
    void getDegree(){
        System.out.println("I am a PostGraduate");
    }
}

 class MethodPgm5 {
    public static void main(String[] args) {
        Degree degreeObj=new Degree();
        degreeObj.getDegree();
        Postgraduate postgraduateObj=new Postgraduate();
        postgraduateObj.getDegree();
        Undergraduate undergraduateObj=new Undergraduate();
        undergraduateObj.getDegree();
    }
}
