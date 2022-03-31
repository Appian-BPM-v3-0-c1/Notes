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
