package String;

public class InitCap { 
  //initCap capitalizes the first letter of a string (or each word)
  public static void main(String[] args) {
    String s = " suraj khan is a passionate person ";
    char[] ch =s.toCharArray();
    for(int i =0;i< s.length();i++){
      if(i==0 || ch[i-1]== ' ')
        if(ch[i]>='a' && ch[i]<='z')
          ch[i] -= 32;
    } System.out.println(ch);
  }
}
