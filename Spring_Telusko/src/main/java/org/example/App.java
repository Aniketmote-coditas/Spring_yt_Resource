package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext("Sping.xml");
//        Vehicle vehicle =(Vehicle)context.getBean("car");
////        vehicle.Drive();

        Car car = (Car) context.getBean("Car");
//        tyre.setBrand("MRF");
//        String str = tyre.toString();
//        System.out.println(str);
        car.Drive();

    }

}
