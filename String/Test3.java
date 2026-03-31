package String;

public class Test3 {
  public static void main(String[] args) {
    String s1 = "Suraj";
    String s2 = "";

    while(s1.length()>0){
      char ch = s1.charAt(0);
      s2 = s1.replace(ch+"","");
      int n = s1.length() - s2.length();
      s1=s2;
      System.out.println(ch+"="+n);
    }
  }
}
