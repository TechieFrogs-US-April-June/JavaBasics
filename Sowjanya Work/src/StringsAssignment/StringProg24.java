package StringsAssignment;

public class StringProg24 {
    public static void main(String[] args) {
        String str = "Hello1 what2 is3 your4 name57936783034894340378478467836";
        int vc = 0;
        int cc = 0;
        int nc = 0;

        //str = str.toLowerCase();
        int i;
        for (i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vc++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cc++;
            }else if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                nc++;
            }
    }
        System.out.println("Number of vowels: " + vc);
        System.out.println("Number of consonants: " + cc);
        System.out.println("Number of numerics: " +nc);

    }



}
