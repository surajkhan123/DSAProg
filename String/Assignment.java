package String;

public class Assignment {
  public static void main(String[] args) {
   int uc = 0,lc = 0,num = 0,sc =0;
    String s ="Ram@123#K";
    for(int i=0;i<s.length();i++){   
      char c = s.charAt(i);
      
      if(c>='A' && c<='Z') uc++;
      else if(c>='a' && c<='z') lc++;
      else if(c>='0' && c<='9') num++;
      else sc++;
    }
    System.out.println("Upper Case:"+uc);
    System.out.println("Lower Case:"+lc);
    System.out.println("Number Case:"+num);
    System.out.println("Symbol Case:"+sc);
    // System.out.println("Upper Case: "+uc+", Lower Case: "+lc+", Number Case: "+num+", Symbol Case: "+sc);
  }
}
