import java.util.HashSet;
import java.util.Set;

class Persona {
    private String name;
    private Integer age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Persona(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj instanceof Persona)
        {
            Persona temp = (Persona) obj;
            if(this.name.equals(temp.name) && this.age==temp.age)
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        
        return (this.name.hashCode() + this.age.hashCode());        
    }
    @Override
    public String toString() {
        return(getName() + " " + getAge());
    }

public static void main(String[] args) {
    Persona p1 = new Persona("Amit",21);
    Persona p2 = new Persona("Bhai",23);
    Persona p3 = new Persona("Cena",25);
    Persona p4 = new Persona("Amit",21);
    Persona p5 = new Persona("Dhawan", 23);
    Persona p6 = new Persona("Amit",22);
    Set<Persona> s = new HashSet<Persona>();
    s.add(p1);
    System.out.println("Adding " +p1);
    s.add(p2);
    System.out.println("Adding " +p2);
    s.add(p3);
    System.out.println("Adding " +p3);
    s.add(p4);
    System.out.println("Adding " +p4);
    s.add(p5);
    System.out.println("Adding " +p5);
    s.add(p6);
    System.out.println("Adding " +p6);
    System.out.println("Added persons are: ");
    for (Persona p : s ) {
        System.out.println(p);
    }
}
}