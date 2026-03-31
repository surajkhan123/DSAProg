package String;
//Print all prefixes
public class Reverse2 {

  public static void main(String[] args) {
    String s ="java is easy";
    String res =" ";
    String[] str= s.split("");
    for(int i=0;i< str.length;i++){
      res += rev(str[i])+"";
      System.out.println(res.trim());
    }


  }

  public static String rev(String s){
    String rev ="";
    for(int i=s.length()-1;i>=0;i--){
      rev +=s.charAt(i);
      // return rev;

    } return rev;

  }
}
