package String;

public class Palindrome1 {
  public static void main(String[] args) {
    String s = "abba";
    String rev ="";
    
    for(int i=s.length()-1;i>=0;i--){
      rev+= s.charAt(i);
    } 
    if(s.equals(rev)){
      System.out.println("Palindrome String");
    } else {
      System.out.println("Not Palindrome String");
    }
  }
}