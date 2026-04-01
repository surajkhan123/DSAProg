package String.SecondMin;

public class SecondMin1 {
  public static void main(String[] args) {
    String s1 = "aaabbc";
    int min1 = Integer.MAX_VALUE;
    int min2 = Integer.MAX_VALUE;
    char minc =' ';
    char minSec = ' ';

    for(char ch: s1.toCharArray()){
      int n = s1.replace(ch+"","").length();
      int occ = s1.length() - n;
      if(occ< min1){
        min2 = min1;
        minSec = minc;

        min1 = occ;
        minc = ch;
      }
      else if(occ!=min1 && occ < min2){
        min2 = occ;
        minSec =ch;
      }
    }
    System.out.println("First Min: "+minc+"="+min1);
    System.out.println("Second Min: "+minSec+"="+min2);


  }
}
