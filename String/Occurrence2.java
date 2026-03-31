package String;

public class Occurrence2 {

  public static void main(String[] args) {
    String s = "Java is very very easy java";
    String[] str = s.split(" ");

    for(int i=0;i<str.length;i++){
      int count =1;
      if(str[i].equals(" ")) continue;

      for(int j=i+1;j< str.length;j++){
        if(str[i].equals(str[j])){
          count++;
          str[j]=" ";
        }
      } System.out.println(str[i]+"="+count);
    }
  }
}