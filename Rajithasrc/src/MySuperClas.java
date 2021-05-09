public class MySuperClas {
    int a=1000;
    float b=500.35f;

    void display(){
        System.out.println("In my Super Class Method"+a+" "+b);
    }
     
    MySuperClas(){
        System.out.println("In My Super class constructor");
    }
    public static void main(String[] args) {
        MySuperClas mysuperObj = new MySuperClas();
        mysuperObj.display();

    }
}
