package org.example;

public class Person{
    private String name ;
    private int age;
    public Person ( String name , int age ){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName ( String name1){
        name = name1;
    }
    public void setAge (String age1){
        age = Integer.parseInt(age1);
    }
    public void printPerson(){
        System.out.println("Person's name is " + name  + " and age is " + age );
    }
    public boolean isAge(int age){
        if(getAge()<=18){
            return false;
        }else {
            return true;
        }
    }
}
