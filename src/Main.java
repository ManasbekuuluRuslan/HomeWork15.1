import person.Builder;
import person.Driver;
import person.Person;
import person.Programmer;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer(18);
        System.out.println("Name "+programmer.getName()+".He is "+Programmer.getAge()+" years old.");
        Programmer.working();
        System.out.println("--------------------------------------------------------------------------");
        Driver driver = new Driver(24);
        System.out.println("Name "+driver.getName()+".He is "+ Person.getAge()+" years old.");
        Driver.working1();
        System.out.println("----------------------------------------------------------------------------");
        Builder builder = new Builder(20);
        System.out.println("Name "+builder.getName()+".He is "+Builder.getAge()+"years old.");
        Builder.working2();
    }
}