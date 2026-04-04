package Comparable;

import java.util.Arrays;

public class MobileDriver {
  public static void main(String[] args) {
    Mobile m1 = new Mobile("Oppo", "blue",20000);
    Mobile m2 = new Mobile("Vivo", "white",17000);
    Mobile m3 = new Mobile("Reno", "pink",22000);
    Mobile m4 = new Mobile("Poco", "MI",20000);
    Mobile m5 = new Mobile("ASUS", "blue",25000);
    

    Mobile[] m = {m1,m2,m3,m4,m5};

    Arrays.sort(m);
    for(Mobile mob:m)
      System.out.println(mob);
  }
}
