package ch.fhnw.edu.eaf.springioc;

import ch.fhnw.edu.eaf.springioc.message.MessageRenderer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class SpringIocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIocApplication.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/helloConfig.xml");

        MessageRenderer mr = (MessageRenderer) context.getBean("renderer");
        mr.render();
	}
}
