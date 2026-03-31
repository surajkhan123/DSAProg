package String;

public class ArrangeString1 {
  public static void main(String[] args) {
    String uc ="", lc="", nc="", sp="";
    String s = "Ram@123#ANA";

    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);

      if(ch>='A' && ch<='Z') uc+=ch;
      else if(ch>='a' && ch<='z') lc+=ch;
      else if (ch>='0' && ch<='9') nc+=ch;
      else sp+=ch;    

    } System.out.println(sp+nc+uc+lc);
  }
}