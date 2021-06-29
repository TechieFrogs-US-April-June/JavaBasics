package Strings;

public class StringSort {
    public String stringSort(String s) {
        String ss = "";
        char[] ch = s.toLowerCase().toCharArray();

        for(int i=0; i<(ch.length-1); i++){
            for(int j=i+1; j>0; j--){
                if(ch[j] < ch[j-1]){
                    char temp = ch[j-1];
                    ch[j-1] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        ss = String.valueOf(ch);

        return ss;
    }

    public static void main(String[] args) {
        StringSort sort = new StringSort();

        String s = "Sowjanya";
        String ss = sort.stringSort(s);

        System.out.println("Original String: "+s);
        System.out.println("Sorted String: "+ss);
    }
}
