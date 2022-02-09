import java.util.*;

public class ComparablePerson extends Persona implements Comparable<Persona> {
    private String name;
    private int age;

    ComparablePerson(String name, int age){
        super(name, age);
        this.name = name;
        this.age = age;
    }
  
    /*
      overriding compareTo() method.
      if the object has same age then it is considered as a
      duplicate entry, else, the entry is sorted on the
      basis of the Person name.
    */
    @Override public int compareTo(Persona o)
    {
        if (age == o.getAge()) {
            return 0;
        }
        else if (name.compareTo(o.getName()) < 0) {
            return -1;
        }
        else
            return 1;
    }
  
    // overriding toString() to print the Person detail
    @Override public String toString()
    {
        return name + " (" + age + ")";
    }
}
  
// driver class
class PersonCollections {
    
    public static void main(String args[])
    {
  
        // create a HashSet which stores objects of type
        // Person
        Set<ComparablePerson> persons = new HashSet<ComparablePerson>();
        
        // add objects to the HashSet
        persons.add(new ComparablePerson("Raghav", 12));
        persons.add(new ComparablePerson("Tilak", 11));
        
        // adding an object with same age
        persons.add(new ComparablePerson("Ayush", 12));
        
        // adding an object with same name but different
        // age
        persons.add(new ComparablePerson("Raghav", 32));
        
        // print the HashSet
        for (ComparablePerson s : persons) {
            System.out.println(s);
        }
        //Adding elements to List to sort via Collections.sort()
        System.out.println("Sorted List:");
        ArrayList<ComparablePerson> list = new ArrayList<ComparablePerson>();
        list.addAll(persons);
        Collections.sort(list);
        for(ComparablePerson s : list) {
            System.out.println(s);
        }
        //Finding index of object via Collections.binarySearch()
        System.out.println("Collections.binarySearch on Tilak: ");
        int index = Collections.binarySearch(list,new ComparablePerson("Tilak", 11));
        System.out.println("Found at index "+ index);

    }
}