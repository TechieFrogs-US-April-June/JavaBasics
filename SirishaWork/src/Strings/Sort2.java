package SirishaWork.src.Strings;

public class Sort2 {
    public static void main(String[] args) {
        String st = "jdkoepacmbtr";
        System.out.println("Before Sorting:" + st);
        int j = 0;
        char temp = 0;
        char[] chars = st.toCharArray();
        for(int i=0; i < chars.length; i++) {
            for(j=0; j < chars.length; j++) {
                if(chars[j] > chars[i]) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        System.out.println("After Sorting:");
        for(int k=0; k < chars.length; k++) {
            System.out.println(chars[k]);
        }
    }
}
