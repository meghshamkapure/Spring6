package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Player p1 =(Player) context. getBean("player1");
        System.out.println(p1.getName());
        System.out.println(p1.getRanking());

        p1.setName("AB Deviliers");
        p1.setRanking(2);

        System.out.println(p1.getName());
        System.out.println(p1.getRanking());

        //Constructor injection

        Developer dev1= (Developer) context.getBean("dev1");
        System.out.println(dev1.toString());
        Developer dev2= (Developer) context.getBean("dev2");
        System.out.println(dev2.toString());
        Developer dev3= (Developer) context.getBean("dev3");
        System.out.println(dev3.toString());
        System.out.println("******");
        Person person = (Person) context.getBean("personObject");
        person.showPerson();

    }
}
