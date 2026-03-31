package String.SecondMin;

public class SecondMin1 {
  public static void main(String[] args) {
    String s1 = "aaabbc";
    int min1 = Integer.MAX_VALUE;
    int min2 = Integer.MAX_VALUE;
    char minc =' ';
    char minSec = ' ';

    for(char ch: s.toCharArray()){
      int n = s.replace(ch+"","").length();
      int occ = s1.length() - n;
      if(min<occ){
        min2 = min;
        minSec = minc;
      }
      else if(occ!=min && occ < min2){
        min2 = occ;
        minSec =ch;
      }
    }
    System.out.println(minc+"="+min1);
    System.out.println(minSec+"="+min2);


  }
}
