package Comparable;

import java.util.Comparator;

public class SortById implements Comparator {
  @Override
  public int compare(Object o1, Object o2){
    Emp e1 = (Emp) o1;
    Emp e2  = (Emp) o2;
    return e1.id - e2.id;   
  }
}

class SortByAge implements Comparator{
  @Override
  public int compare(Object o1, Object o2){
    return ((Emp)o1).age - ((Emp)o2).age; 
  }
}
class SortByName implements Comparator{
  @Override
  public int compare(Object o1, Object o2){
    Emp e1 = (Emp) o1;
    Emp e2 = (Emp) o2;

  }
}
