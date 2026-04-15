package RegularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
  public static void main(String[] args) {
    String exp ="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{4,6}";
    String s ="Suraj@123";

    Pattern p = Pattern.compile(exp);
    Matcher m = p.matcher(s);
    
    if(m.find()) 
      System.out.println("Valid Password");
    else
      System.out.println("Invalid Password");
    
  }
}
