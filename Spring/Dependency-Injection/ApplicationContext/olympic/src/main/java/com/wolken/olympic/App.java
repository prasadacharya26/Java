package com.wolken.olympic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wolken.olympic.DI.Olympics;

public class App 
{
    public static void main( String[] args )
    {
        Resource resource=new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        beanFactory.getBean("name") ;
        Olympics olympics=(Olympics) beanFactory.getBean("details") ;
        olympics.print();
    }
}
