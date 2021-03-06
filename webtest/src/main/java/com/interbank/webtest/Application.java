package com.interbank.webtest;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.integration.jmx.config.EnableIntegrationMBeanExport;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;




/*
@Configuration
@EnableWebMvc
@ComponentScan
@EnableAutoConfiguration
@EnableConfigurationProperties
@PropertySource(value = { "file:///Proyectos/Apps/config/application.yml" })
*/

@Configuration
@ComponentScan
@EnableAutoConfiguration

//@PropertySource(value = { "file:/Proyectos/Apps/config/application.yml" })
//@PropertySource(value = {"classpath:application.yml", "file:/Proyectos/Apps/config/application.yml"}, ignoreResourceNotFound = true)
//@PropertySource(value = {"file:/Proyectos/Apps/config/application-${spring.profiles.active}.yml"})
//@PropertySource(value = {"classpath:application.yml", "file:/Proyectos/Apps/config/application-${spring.profiles.active}.yml"}, ignoreResourceNotFound = true)
public class Application extends SpringBootServletInitializer  implements WebApplicationInitializer{
		
	 public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		 
		 		    

		    

	}
	
	/*
	 	public static void main(String[] args) {
	        SpringApplication.run(applicationClass, args);
	    }

	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(applicationClass);
	    }

	    private static Class<Application> applicationClass = Application.class;*/
	
	
	/*
	@Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
	    return springApplicationBuilder
	            .sources(Application.class)
	            .properties(getProperties());
	 }

	 public static void main(String[] args) {

	    SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(Application.class);
	    
	    springApplicationBuilder.sources(Application.class)
        						.properties(getProperties())
        						.run(args);
	            
	 }
	
	    
	    static Properties getProperties() {
	        Properties props = new Properties();
	        //props.put("spring.config.location", "classpath:myapp1");
	        
	        ├src
			| └main
			|   └resources
			|     └myapp1
			|       └application.properties
			|       └application-development.properties
			|       └logback.xml
			└─pom.xml
	         
	        props.put("spring.config.location", "/Proyectos/Apps/config");
	        return props;
	      }*/
}


