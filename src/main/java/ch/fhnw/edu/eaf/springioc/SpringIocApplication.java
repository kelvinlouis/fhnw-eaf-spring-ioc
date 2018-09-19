package ch.fhnw.edu.eaf.springioc;

import ch.fhnw.edu.eaf.springioc.message.MessageRenderer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class SpringIocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIocApplication.class, args);

        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
	}

    private static BeanFactory getBeanFactory() {
	    XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("/spring/helloConfig.xml"));
        return factory;
	}
}
