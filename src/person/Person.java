package person;

public class Person {
    private final String name = "Ruslan";
    private  static int age = 20;

    public Person(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
    static void working(){

    }

}
