package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class DemoApplication {

	public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ConfigurationFile.class);
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));

		System.out.println(context.getBean("person"));

		System.out.println(context.getBean("person2MethodCall"));

		System.out.println(context.getBean("person3Parameters"));

		System.out.println(context.getBean(Person.class));  // auto wiring using Primary to understand person

		System.out.println(context.getBean("MyCustomAddress"));
		System.out.println(context.getBean(Address.class));


		//printing all beans
//		Arrays.stream(context.getBeanDefinitionNames())
//				.forEach(System.out::println);
	}

}
