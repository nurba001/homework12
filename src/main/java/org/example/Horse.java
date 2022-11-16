package org.example;

import org.springframework.stereotype.Component;

//@Component
public class Horse implements Animal{
    private String gender;
    private String poroda;
    private int age;

    public Horse(){}

    public Horse (String gender,String poroda,int age){
        this.gender=gender="per";
        this.poroda=poroda="house";
        this.age=age=3;
    }


    @Override
    public String minusAnimal() {
        return null;
    }

    @Override
    public String plusAnimal() {
         return poroda+"  flash";
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "gender='" + gender + '\'' +
                ", poroda='" + poroda + '\'' +
                ", age=" + age +
                '}';
    }
}
