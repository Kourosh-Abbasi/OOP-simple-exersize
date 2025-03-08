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

    public Person(String esm , int sen)
    {
        setName(esm);
        setAge(sen);
    }
    public void display()
    {
        System.out.println(getName() + " " + getAge() );
    }

    public void check_age()
    {
        if (age >= 18)
        {
            System.out.println("this an adult");
        }
    }


}
