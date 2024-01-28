import java.util.regex.*;

public class Password {
    static int isValidPassword(String password)
    {
        if(password.length()<8)
        {
            return 0;
        }
        if(!containsUppercase(password) || !containsLowercase(password) || !containsSpecialCharacter(password) || !containsDigit(password))
        {
            return 0;
        }
        if(containsWhitespace(password))
        {
            return 0;
        }
        return 1;
    }

    static boolean containsUppercase(String password)
    {
        return password.matches(".*[A-Z].*");
    }

    static boolean containsLowercase(String password)
    {
        return password.matches(".*[a-z].*");
    }

    static boolean containsSpecialCharacter(String password)
    {
        Pattern specialCharacter=Pattern.compile("[!@#$%^&*()_+{}\\:;<>,.?/-]");
        Matcher matcher=specialCharacter.matcher(password);
        return matcher.find();
    }

    static boolean containsDigit(String password)
    {
        return password.matches(".*\\d.*");
    }

    static boolean containsWhitespace(String password)
    {
        return password.contains(" ");
    }
    public static void main(String[] args) {
        String password="MyPswrd$2003";
        int result=isValidPassword(password);
        System.out.println(result);
    }
}
