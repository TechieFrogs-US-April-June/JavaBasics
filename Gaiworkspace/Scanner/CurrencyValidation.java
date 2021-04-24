import java.util.regex.*;
public class CurrencyValidation {
    String text = "Currency symobols are : $ Dollar, ₹ Rupees ";
 
        String regex = "\\p{Sc}";
 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(" : " + matcher.group());
        }
        sc.close();
    
}
}