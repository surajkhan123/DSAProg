package String.RemoveDuplicate;

public class MissingVowels1 {
  public static void main(String[] args) {
    String s = "aeiouAEIOU";
    String res ="I LOVE My India";
    String s2="";

    for(int i=0;i< s.length();i++){
      char ch = s.charAt(i);

      if(!res.contains(ch+""))
        s2 += ch;
    } System.out.println(s2);
  }
}

