import Animals.Animal;
class Tiger implements Animal{
    public void eats(){
        System.out.println("Tiger eats meat.");
    }
    public void travels(){
        System.out.println("Tiger travels in Savannah");
    }
}

public class AnimalImplem  {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.eats();
        t1.travels();
    }
}
