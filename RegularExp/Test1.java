package RegularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
  public static void main(String[] args) {
    String exp ="[^0-9a-zA-Z]";
    String s ="@$ab2c4n5m7BtU#";

    Pattern p = Pattern.compile(exp);
    Matcher m = p.matcher(s);
    while (m.find()) {
      System.out.println(m.group());
      
    }
  }
}
