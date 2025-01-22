package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringXmlConfig.xml");

        //Getting the object through className
        Computer c1 = context.getBean(Computer.class);
        c1.setModelName("Lenovo Legion Y540");
        c1.setPrice(70000);

        System.out.println("Computer Model is "+c1.getModelName()+ " and its price is "+c1.getPrice());

        //Getting the object through ID mentioned in SpringXmlConfig.xml
        Person p1 =(Person) context.getBean("personObject1");
        p1.setName("Meghsham Kapure");
        p1.setAge(28);

        Person p2 =(Person) context.getBean("personObject2");
        p2.setName("Asim Desai");
        p2.setAge(29);

        System.out.println("My name is "+p1.getName()+" and my age is "+p1.getAge());
        System.out.println("My name is "+p2.getName()+" and my age is "+p2.getAge());

    }
}
