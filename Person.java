class Person {
    private String name;
    private int age;

    public Person(String name , int age){
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
    public void chekadult(){
        if (age>=18){
            System.out.println("adult");
        }else System.out.println("not adult");
    }
    public void display(){
        System.out.println("name : "+name +  "   " + "age : "  + age);
    }
}

