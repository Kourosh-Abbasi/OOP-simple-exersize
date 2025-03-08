public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 22);
        String name = person.getName();
        int age = person.getAge();
        System.out.println(name + " is " + age + " years old.");
        System.out.println("***");
        person.setName("Bob Smith");
        person.setAge(18);
        person.printPersonDetails();
        System.out.println("***");
        Person person2 = new Person("William Jones", 9);
        person2.printPersonDetails();

    }

}
