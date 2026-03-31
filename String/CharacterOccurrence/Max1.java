package String.CharacterOccurrence;

public class Max1 {
  public static void main(String[] args) {
    String s = "jaaavva";
    int len = s.length();

    int max = Integer.MIN_VALUE;
    char c = '\u0000';

    for (char ch : s.toCharArray()) {
      int n = s.replace(ch + "", "").length();
      int count = len - n;

      if (max < count) {
        c = ch;
        max = count;
      }
    }

    // print only once
    System.out.println(c + " = " + max);
  }
}