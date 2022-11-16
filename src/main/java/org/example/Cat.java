package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Cat implements Animal{
    @Value("${cat.gender}")
    private String gender;
    @Value("${cat.poroda}")
    private String poroda;
    @Value("${cat.age}")
    private int  age;

    public Cat(){}

    public Cat(String gender,String poroda,int age)
    {
        this.poroda=poroda;
        this.gender=gender;
        this.age=age;
    }

    public String getGender(){
       return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getPoroda(){
        return poroda;
    }
    public void setPoroda(String poroda){
        this.poroda=poroda;
    }


    @Override
    public String minusAnimal() {
        return null;
    }

    @Override
    public String plusAnimal() {
        return poroda+" milyi";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "gender='" + gender + '\'' +
                ", poroda='" + poroda + '\'' +
                ", age=" + age +
                '}';
    }
}
