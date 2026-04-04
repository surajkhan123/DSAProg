package Comparable;

import java.util.Arrays;

public class EmpDriver {
  public static void main(String[] args) {
    Emp e1 = new Emp("Rahim", 29,3);
    Emp e2 = new Emp("Salman", 26,1);
    Emp e3 = new Emp("Amir", 28,2);
    Emp e4 = new Emp("Suraj", 25,3);
    Emp e5 = new Emp("Saif", 30,5);

    Emp[] e = {e1,e2,e3,e4,e5};

    Arrays.sort(e);
    for(Emp emp:e)
      System.out.println(emp);
  }
}
