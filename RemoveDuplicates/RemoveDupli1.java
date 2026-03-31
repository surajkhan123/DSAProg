package RemoveDuplicates;

public class RemoveDupli1 {
  public static void main(String[] args) {
    String s ="java is very very easy java";
    String[] str= s.split(" ");
    
    for(int i=0;i<s.length();i++){
      int count = 1;
      //if(str[i]="") continue;
      for(int j=0;j<s.length();j++){
        if(str[i].equals(str[j]))
        {
          count++;
          str[j]=" ";
        }

      } System.out.println(str[i]+"="+count);
    }
  }
}
