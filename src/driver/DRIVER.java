package driver;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Application;
 

public class DRIVER {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("configurations/app-context.xml");
		 
        Application application = (Application)context.getBean("application");
        application.display();

	}

}
