public class Person {
    private String name;
    private int age;
    public Person(String name , int age ) {
        this.name = name;
        this.age = age;

    }
        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }
public boolean checkAge (int age){
    return age >= 18;
}
    public void printPersonDetails () {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        if(checkAge(age)){
            System.out.println("You are an adult person");
        } else {
            System.out.println("You are not an adult! ");
        }
    }
}
