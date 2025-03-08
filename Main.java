public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Abolfazl" , 19);
        p1.display();
        if(p1.getAge() >= 18)
        {
            System.out.println("You are an adult person");
        }
        else
        {
            System.out.println("You are a young person");
        }

    }
}
