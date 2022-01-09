class Waffle{
    String flavour;
    int price;
    Waffle(int price, String flavour){
        this.price = price;
        this.flavour = flavour;
    }
    @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Waffle waffle1 = (Waffle) o;
            return price == waffle1.price &&
                    flavour.equals(waffle1.flavour);
        }
    @Override
        public String toString() {
        return "Waffle flavour : " +this.flavour +" and Waffle price : $" + this.price;
        }
    }  
public class WaffleMain {
    public static void main(String[] args) {
        Waffle waffle1 = new Waffle(10, "Pistachio");
        Waffle waffle2 = new Waffle(20, "Vanilla");
        Waffle waffle3 = waffle1;
        Waffle waffle4 = new Waffle(20,"Vanilla");
        Waffle[] waffles = {waffle1,waffle2, waffle3, waffle4};
        System.out.println("The waffles present in the program: ");
        for(Waffle waffle : waffles) {
            System.out.println(waffle);
        }
        if(waffle1 == waffle2) {
            System.out.println("Waffle 1 and 2 are the same objects using ==");
        }
        if(waffle2 == waffle3) {
            System.out.println("Waffle 2 and 3 are the same objects using ==");
        }
        if(waffle1 == waffle3) {
            System.out.println("Waffle 1 and 3 are the same kind using ==");
        }
        if(waffle1.equals(waffle3)) {
            System.out.println("Waffle 1 and 3 are the same kind using equals()");
        }
        if(waffle4.equals(waffle2)) {
            System.out.println("Waffle 2 and 4 are the same kind using equals()");
        }
        if(waffle4 == waffle2) {
            System.out.println("Waffle 2 and 4 are the same using == ");
        }
    }    
}

