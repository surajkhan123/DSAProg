package String.SmallestPalindrome;

public class A {
  public static void main(String[] args) {
    String s = "malayala";
    String smallPalindrome = s;
    for(int i=0;i< s.length();i++){
      for(int j =i+3;j< s.length();j++){
        String str = s.substring(i, j);{
          if(str.length()< smallPalindrome.length())
            smallPalindrome = str;
        }
        
      }
    } System.out.println(smallPalindrome);
  }
  public static boolean isPalindrome(String s){
    int i=0; int j = s.length()-1;
    while(i<j){
      if(s.charAt(i)!= s.charAt(j))
        return false;
      i++;
      j--;
    } return true;
  } 
}
