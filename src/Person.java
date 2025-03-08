public class Person
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Person(String n , int a)
    {
        setName(n);
        setAge(a);
    }

    public void diplay()
    {
        System.out.println("your name: " + getName());
        System.out.println("your age: " + getAge());
    }

    public void checkAge()
    {
        if(age >=18)
        {
            System.out.println("this is an adult");
        }
    }

}
