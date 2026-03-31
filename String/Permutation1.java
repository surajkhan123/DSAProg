package String;

public class Permutation1 {
  public static void main(String[] args) {
    String s = "abc";
    permutation(s,0,s.length()-1);

  }
  public static void permutation(String s,int st,int end){
    if(st==end){
      System.out.println(s);
      return;
    }
    for(int i=st;i<=end;i++){
      String s1 =swap(s,st,i);
      permutation(s1, st+1, end);
    }
  }
  public static String swap(String s, int i, int j){
    char[] ch =s.toCharArray();
    char temp = ch[i];
    ch[i] = ch[j];
    ch[j] = temp;
    return new String(ch);
  }
}
