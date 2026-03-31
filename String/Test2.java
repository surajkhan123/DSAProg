package String;

public class Test2 {

  public static void main(String[] args) {
    String s1 = "banana";
    String s2 = "";

    while(s1.length()>0){
      char c = s1.charAt(0);
      s2 = s1.replace(c+"","");
      int n =s1.length()-s2.length();
      System.out.println(c+"="+n);
      s1=s2;
    }
  }
}