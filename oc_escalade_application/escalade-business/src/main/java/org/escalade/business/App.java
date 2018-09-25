package org.escalade.business;


import org.escalade.consumer.contract.DaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
            ApplicationContext vApplicationContext = new ClassPathXmlApplicationContext("classpath:/businessContext.xml");
            DaoFactory vDaoFactory = vApplicationContext.getBean("managerFactory", DaoFactory.class);

    }


}
