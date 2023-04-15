package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class Person {

    private Animal animal;

    private Animal animal1;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    public void likeAnimal(){
        System.out.println(name +" like Animal");
        System.out.println(animal.plusAnimal());
        System.out.println(animal1.plusAnimal());
        System.out.println(name+" lovey");
    }


    public Person(@Qualifier("cat") Animal animal,@Qualifier("horse") Animal animal1){
        this.animal=animal;
        this.animal1=animal1;
    }

    public void myInit(){
        System.out.println("started my init method");
    }
    public void myDesctope(){
        System.out.println("desctop method");
    }
    public Person(){}

    public Person (Animal animal1,String name, int age){
        this.animal1=animal1;
        this.name=name;
        this.age=age;
    }
//    public Animal getAnimal(){
//        return animal;
//    }
//    public void setAnimal(Animal animal){
//        this.animal=animal;
//    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "animal='" + animal + '\'' +
                "animal1='" + animal1 + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
