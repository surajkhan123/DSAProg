package String;
// Remove duplicate string
public class RemoveDuplicate2 {
  public static void main(String[] args) {
    String s ="Bangalore is Bangalore City";
    String[] str = s.split(" ");
    String res ="";

    for(int i=0;i< str.length;i++){
      if(!res.contains(str[i])){
         res += str[i]+" ";
      }
    }       
    System.out.println(res.trim());
  }
}
