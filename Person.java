public class Person{
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String isAdult(){
        if(this.age >= 18){
            return "an adult";
        }
        else if(this.age < 0){
            return "a time traveler lost in the past";
        }
        else{
            return "a kid";
        }
    }

    public void display(){
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("and (he/she) is " + isAdult());
    }

}