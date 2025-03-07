public class Main{
    public static void main(String[] args) {
        Person person = new Person("Sina", 18);
        String name = person.getName();
        int age = person.getAge();
        
        System.out.println("name: " + name);
        System.out.println("age: " + age);

        System.out.println();

        person.display();

        System.out.println();

        person.setName("Shifu");
        person.setAge(-7);
        person.display();

    }
}