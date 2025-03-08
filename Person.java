public class Person {
    private String name;
    private int age;
     //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void display(){
        System.out.println("Personal Info[ Name: " + name + ", Age: " + age + "]");
    }
    public void isadult(){
        if(age >= 18) System.out.println("and You are Adult! ^~^");
        else {
            System.out.println("and You are not Adult! ^_^");
        }

    }
}
