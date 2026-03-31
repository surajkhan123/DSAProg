package String.CharacterOccurrence;

public class DuplicateCharOcc1 {
  public static void main(String[] args) {
    // ip: java op; a:2
    // ip: ram  op: ram(no duplicate)
    String s = "mississippi";
    String seen =" ";
    boolean flag = true;
    for(char ch: s.toCharArray()){
      int occ = s.length()- s.replace(ch+"","").length();
      if(occ>1 && seen.indexOf(ch)==-1){
        flag = false;
        seen+=ch;
        System.out.println(ch+"="+occ);
      }
          

    } if(flag){System.out.println(s);}
  }
}
