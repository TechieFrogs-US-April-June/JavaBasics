import java.util.regex.*;
public class MultiDataValidation {
    public static void main(String args[]) {
        String password1 = "Gai@tech1";
 
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        boolean validPassword = isValidPassword(password1,regex);
        System.out.println("Gai@tech1 is valid password:" +validPassword);
 
        String password2 = "Learningjava1cs";
 
        String regex1 = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        boolean validPassword1 = isValidPassword(password2,regex1);
        // No upper case
        System.out.println("Learningjava1cs is valid password:" +validPassword1);
    }
 
    public static boolean isValidPassword(String password,String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    
    }

    
    
    

