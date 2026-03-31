package String;

public class Reverse1 {
  public static void main(String[] args) {
    String s  = "java is easy";
    String[] str = s.split(" ");  // using split() method

    for(int i = str.length-1; i>=0; i--){
      System.out.print(str[i]+" ");

    }
  }
}
