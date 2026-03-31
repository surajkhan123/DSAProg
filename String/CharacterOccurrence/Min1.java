package String.CharacterOccurrence;

public class Min1 {
  public static void main(String[] args) {
    String s ="jaaaavva"; 
    int min = Integer.MAX_VALUE;
    int len = s.length();
    char c ='\u0000';

    for(char ch: s.toCharArray()){
      int n = s.replace(ch+"","").length();
      int count = len -n;
      if(count < min) {
        c =ch;
        min = count;
      }
    } System.out.println(c+"="+min);
  }
}
