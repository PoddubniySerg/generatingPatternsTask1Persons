public class PersonBuilder {
    private String personName;
    private String personSurname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        this.personName = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.personSurname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) throw new IllegalArgumentException("The age cannot be less than zero");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (this.personName == null || this.personSurname == null) {
            throw new IllegalStateException("There are not enough required fields");
        }
        return new Person(this.personName, this.personSurname, this.age, this.city);
    }
}
