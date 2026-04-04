package Comparable;

public class Mobile implements Comparable{

  String name; String color; double price;

  public Mobile(String name,String color, double price){
    this.name = name;
    this.color = color;
    this.price = price;
  }
  @Override

  public  String toString(){
    return "Mobile [name= "+name+", color= " + color+", price= "+price+"]";
  }
  @Override
  public int compareTo(Object o){
    Mobile m =(Mobile)o;

    // return Double.compare(this.price, m.price); // accending order
    
    return Double.compare(m.price, this.price); // decending order
  }

  
}

