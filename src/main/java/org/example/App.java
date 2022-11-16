package org.example;


import org.example.config.Myconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Myconfig.class);
        Person person=context.getBean("person",Person.class);
/*        Person person1=context.getBean("person",Person.class);

        System.out.println(person1.equals(person));
        System.out.println(person1);*/
        person.likeAnimal();
        context.close();
    }
}
