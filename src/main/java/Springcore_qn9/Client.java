package Springcore_qn9;



import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Springcore_qn9.HelloWorld;


public class Client {

	public static void main(String[] args)
		throws Exception
	{

		AbstractApplicationContext cap= new ClassPathXmlApplicationContext(	"Springcore_qn9/config.xml");

		//Below hook method calls the drestroy method in xml 
		// below hook method is from  abstract appliaction Context
		cap.registerShutdownHook();
	}
}
