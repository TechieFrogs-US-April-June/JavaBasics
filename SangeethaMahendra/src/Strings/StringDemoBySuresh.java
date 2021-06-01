package src.Strings;

public class StringDemoBySuresh {

    // HOW TO ITERATE STRING ARRAY?
    public static void main(String[] args) {
//         char s[] = {'S','u','n','i','l'};
//    {
//    for(char te:s)
//    {
//     System.out.print(te);
//    }

        String a[] = {"Sunil", "Gayathri" , "Anu" };
        for(String t:a)  //Advanced for loop
        {
           System.out.println("String Array ===>  "+ t);
        }
        CharArray obj = new CharArray();
        obj.disp();
    }
}
//}
class CharArray
{
    //variables , methods, constructors are only allowed directly inside class
  void disp(){
 // public char te;
   char s[] = {'S','u','n','i','l'};
   {
   for(char te:s)
   {
    System.out.println(te);
   }
}

}
}