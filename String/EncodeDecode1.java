package String;

public class EncodeDecode1 {
  public static void main(String[] args) {
    System.out.println(encode("abc",3)); //def
    System.out.println(decode("def",3)); //abc
    
  }
  public static String encode(String s, int n){
    char[] ch =s.toCharArray();
    for(int i=0;i<ch.length;i++){
      if(Character.isUpperCase(ch[i])){
        ch[i] = (char)(((((ch[i]+n-'A')%26)+26)%26)+'A');
      } else if(Character.isLowerCase(ch[i])){
        ch[i] = (char)(((((ch[i]+n-'a')%26)+26)%26)+'a');
      } 
    } return new String(ch);
  }
  public static String decode(String s, int n){
    return encode(s, -n);
  }
}
