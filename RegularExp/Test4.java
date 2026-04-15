package RegularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {
  public static void main(String[] args) {
    String exp ="[a-z][0-9]";
    String s ="a1bb2b3de5";

    Pattern p = Pattern.compile(exp);
    Matcher m = p.matcher(s);
    while (m.find()) {
      System.out.println(m.group());
    }
  }
}
