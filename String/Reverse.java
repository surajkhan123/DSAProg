package String;

public class Reverse {
  public static void main(String[] args) {
    String s = "Suraj";

    for(int i=0;i<s.length();i++){
      System.out.println(s.charAt(i));
    }
    System.out.println("*************");
    for(int i=s.length()-1;i>=0;i--){
      System.out.println(s.charAt(i));
    }
    
  }
}
