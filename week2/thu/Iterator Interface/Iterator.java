import java.util.*;
import java.io.*;
class Employees implements Iterable {
  
  List<String> string = null;
  public Employees()
  {
    string = new ArrayList<String>();
    string.add("Customer");
    string.add("Customer1");
    string.add("Customer2");
    string.add("Customer3");
    string.add("Customer4");
    string.add("Customer5");
    string.add("Customer6");
  }
  
  @Override public Iterator<String> iterator()
  {
    return string.iterator();
    }
}
