package com.firstmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
public class FirstmicroserviceApplication
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = SpringApplication.run(FirstmicroserviceApplication.class, args);

		String[] beanNames = ctx.getBeanDefinitionNames();

		Arrays.sort(beanNames);

		for (String beanName : beanNames)
		{
			System.out.println(beanName);
		}
	}
}
