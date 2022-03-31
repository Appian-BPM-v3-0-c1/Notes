import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<Employee> Arr = new ArrayList<Employee>();
        Array.add(new Employee(1011, "Dylan", "Student3"));
        Array.add(new Employee(1011, "Dylan", "Student4"));
        Array.add(new Employee(1011, "Dylan", "Student5"));
        System.out.println("unsorted data");
        for (int i = 0; i < Array.size(); i++)
            System.out.println(Array.get(i));
        Collections.sort(Array, new Sortbyroll());
        System.out.println("nSorted data according to Employee name");
        for (int i = 0; i < Array.size(); i++)
            System.out.println(Array.get(i));
    }
}
