public class Main {
    public static void main(String[] args) {
        Person person = new Person("Liam", 25);
        person.ShowDetails();
        person.underAgeOrNot();

        Person person2 = new Person("Harry", 30 );

        person2.setName("Sharlot");

        person2.setAge(16);

        person2.ShowDetails();

        person2.underAgeOrNot();

    }
}
