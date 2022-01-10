package PersonPackage;

public class Person {
    private String firstName, lastName;
    public Person(String first, String last){
        this.firstName = first;
        this.lastName = last;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void displayFirstName(){
        System.out.println("First Name: "+ getFirstName());
    }
    public void displayLastName(){
        System.out.println("Last Name: "+ getLastName());
    }
}
