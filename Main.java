package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//mjzz
        Person person = new Person("Mehdi" , 19  );
        String name = person.getName();
        int age =  person.getAge();
        System.out.println("Person's name is " + name  + " and age is " + age );
        System.out.println("Enter identity for next person (name && age )");
        String name1 = sc.nextLine();
        String age1 = sc.nextLine();
        person.setName(name1);
        person.setAge(age1);
        person.printPerson();
        if(person.isAge(person.getAge())){
            System.out.println("Old enough !");

        }else{
            System.out.println("Still a child .");
        }
    }
}