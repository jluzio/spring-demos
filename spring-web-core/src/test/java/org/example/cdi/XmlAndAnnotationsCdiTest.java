package org.example.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XmlAndAnnotationsCdiTest {
	@Autowired
	private GreeterManager greeterManager;
	
	@Configuration
	@ComponentScan(basePackages="org.example")
	@ImportResource("classpath:/org/example/cdi/XmlAndAnnotationsCdiTest.applicationContext.xml")
	static class Config {
	}

    @Test
    public void exampleTest() {
    	greeterManager.greet();
    	greeterManager.fancyGreet();
    }

}