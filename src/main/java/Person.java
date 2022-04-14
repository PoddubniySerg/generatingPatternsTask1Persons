public class Person {
    protected final String name;
    protected final String surname;

    private int age;
    private String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = -1;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddres() {
        return city;
    }

    public void setAddres(String city) {
        this.city = city;
    }

    public void happyBirthday() {
        this.age += 1;
    }

    public boolean hasAge() {
        return this.age < 0 ? false : true;
    }

    public boolean hasAddress() {
        return this.city == null ? false : true;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAge(0)
                .setAddress(this.city);
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname
                + (hasAddress() ? " (город " + this.city : "неизвестен,")
                + (hasAge() ? " возраст " + this.age + ")" : "неизвестен)");
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode();
    }
}