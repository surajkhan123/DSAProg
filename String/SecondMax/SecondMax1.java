package String.SecondMax;

public class SecondMax1 {
  public static void main(String[] args) {
    String s1= "aaabbbcc";
    char maxChar1 = ' ';
    int maxCount1 =0;
    char maxChar2 = ' ';
    int maxCount2 =0;

    while(s1.length()>0){
      char ch = s1.charAt(0);
      String s2 = s1.replace(ch+"", "");
      int count = s1.length() - s2.length();
      if(count > maxChar1){
        maxCount2= maxCount1;
        maxChar2= maxChar1;
        maxCount1 = count;
        maxChar1 =ch;
      } else if (count>maxCount2 && count!=maxCount1) {
      maxCount2 = count;
      maxChar2 = ch;
    } s1 = s2;
      
    } System.out.println(maxChar1+"="+maxCount1);
    System.out.println(maxChar2+"="+maxCount2);

  }
}
