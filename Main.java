public class Main {
    public static void main(String[] args) {
        Person person= new Person("Moeed",18);
        String name = person.getName();
        int age = person.getAge();
        System.out.println("Name :"+name+" ,Age :"+age);
        System.out.println("**************************************");
        person.setName("Mohammad");
        person.setAge(20);
        person.display();
        System.out.println("**************************************");
        if (person.isAdult())
            System.out.print(person.getName()+" is adult");
        else
            System.out.print(person.getName()+" is not adult");
    }
}
