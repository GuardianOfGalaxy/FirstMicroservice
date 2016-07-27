package com.firstmicroservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FirstmicroserviceApplication.class)
@WebAppConfiguration
public class FirstmicroserviceApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("FirstmicroserviceApplicationTests - > contextLoads()");
	}

}
