package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){};

record Address(String city, String flat){};
@Configuration
public class ConfigurationFile {

    @Bean
    public String name(){
        return "Jeevan";
    }

    //custome name using Bean(name ="custom name");
    @Bean
    public Person person(){
        Address Address = new Address("Jaisalmer", "A1");
        var person = new Person("Jeevan Rajpurohit",22,Address);
        return person;
    };

    @Bean(name = "MyCustomAddress")
    @Primary
    public Address address(){
        var address = new Address("Surat", "A24");
        return address;
    }

    @Bean
    public int age(){
        return 10;
    }

    @Bean
    @Primary
    public Person person2MethodCall(){
        return new Person(name(),age(),address());
    }

    @Bean
    public Person person3Parameters(String name, int age, @Qualifier("person4Qualifier") Address address){
        return new Person(name, age, address);   // not have to call method .
    }

    @Bean
    @Qualifier("person4Qualifier")
    public Address address2(){
        return new Address("Barmar","B24");
    }


}
