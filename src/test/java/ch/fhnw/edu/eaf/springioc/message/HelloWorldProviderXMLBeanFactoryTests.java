package ch.fhnw.edu.eaf.springioc.message;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.assertEquals;

public class HelloWorldProviderXMLBeanFactoryTests {
    private MessageProvider provider;

    @Before
    public void before() {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("/spring/helloConfig.xml"));
        provider = (MessageProvider) factory.getBean("providerHello");
    }

    @Test
    public void testGetMessage(){
        assertEquals("Hello World", provider.getMessage());
    }
}
