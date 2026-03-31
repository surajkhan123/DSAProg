package String; //String Manipulation
  // char count trick using replace
public class Test1 {
  public static void main(String[] args) {
    String s1 = "banana";
    int c = s1.length()-s1.replace("a","").length();

    System.out.println(c);

    // System.out.println(s1.length());
    // System.out.println(s1.replace("a", "").length());
    
  }
}
