package springProject;

import javax.naming.Context;

import org.apache.log4j.lf5.util.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	
	
	public static void main(String[] args) {
		
		// initialize and object using Triangle class
//		Triangle triangle = new Triangle();
		
		// Instantiate BeanFactory
		// Using Xml BeanFactory reads the configurations of the bean from spring.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springProject/resources/spring.xml");
		
		// Here we are asking the BeanFactory to retrieve the specified bean
		// we use getBean method and pass the id of the bean
		// Storing getBean into an object variable and since its an object
		// we need to cast it using (Triangle).
		Triangle triangle = (Triangle) context.getBean("triangle");
		
//		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
