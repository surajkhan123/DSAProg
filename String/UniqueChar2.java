package String;

public class UniqueChar2 {
  public static void main(String[] args) {
    String s = "Statistics";

    char[] ch = s.toCharArray();
    for(int i=0;i< s.length();i++){
      int count =0;
      for(int j =0;j<s.length();j++){
        if(ch[i]==ch[j])
          count++;
    } if(count==1) System.out.print(ch[i]);
  }
  }
}
