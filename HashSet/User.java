package HashSet;
import java.util.HashSet;

public class User {
  public static void main(String[] args) {
    
    HashSet1 h = new HashSet1();
    

    
    h.add("Rama");
    h.add("Radha");
    h.add("Sita");
    h.add("Kittu");
    h.add("Banti");
    h.add("Vali");

    // h.display();
    // System.out.println(h.contains("Sita"));

    // System.out.println(h.remove("Sita"));
    h.remove("Sita");
    h.display();
  }
  
}