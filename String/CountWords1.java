package String;

public class CountWords1 {
  public static void main(String[] args) {
    String s = "java is easy"; // this program is only for single space
    int space =0;

    for(int i=0;i<s.length();i++){
    if(s.charAt(i)==' '){
      space++;
    }
    }
    int world = space+1;
    System.out.println(world);
     
    
  }
}
