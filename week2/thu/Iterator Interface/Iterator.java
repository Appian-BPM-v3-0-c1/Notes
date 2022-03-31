import java.util.*;
import java.io.*;
class Employees implements Iterable {
  
  List<String> str = null;
  public Employees()
  {
    str = new ArrayList<String>();
    str.add("Customer");
    str.add("Customer1");
    str.add("Customer2");
    str.add("Customer3");
    str.add("Customer4");
    str.add("Customer5");
    str.add("Customer6");
  }
  
  @Override public Iterator<String> iterator()
  {
    return str.iterator();
    }
}


public class Myclass {
  public static void main(String[] args)
  {
    ArrayList<Integer> numbers
      = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    
    Iterator<Integer> it = numbers.iterator();
    while (it.hasNext()) {
      
      Integer i = it.next();
      
      if(i < 10) {
        
        it.remove();
      }
    }
    System.out.println(numbers);
    }
}
  
