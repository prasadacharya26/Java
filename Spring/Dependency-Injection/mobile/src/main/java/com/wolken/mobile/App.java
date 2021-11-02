package com.wolken.mobile;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wolken.mobile.DI.Mobile;

public class App 
{
    public static void main( String[] args )
    {

  	  Resource resource=new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        beanFactory.getBean("name") ;
        Mobile mobile=(Mobile) beanFactory.getBean("details") ;
        mobile.print();
    }
}
