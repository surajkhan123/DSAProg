package RegularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gmail {
  public static void main(String[] args) {
    String exp ="[a-z][a-z0-9]+@gmail[.]com";
    String s ="Suraj123@gmail.com";

    Pattern p = Pattern.compile(exp);
    Matcher m = p.matcher(s);
    if (m.find()) 
      System.out.println("Valid Gamil");
      else
        System.out.println("Invalid Gmail");
    
  }
}
