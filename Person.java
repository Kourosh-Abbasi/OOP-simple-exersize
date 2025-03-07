public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void ShowDetails() {
        System.out.println("Name: " + name + '\n' + "Age: " + age);
    }

    public void underAgeOrNot() {
        if (this.age >= 18) {
            System.out.println("This person is an adult");
        } else {
            System.out.println("FBI OPEN UP!");
        }
    }
}
