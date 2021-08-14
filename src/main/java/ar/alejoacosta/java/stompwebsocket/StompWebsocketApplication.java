package ar.alejoacosta.java.stompwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication adds all of the following:
- @Configuration: Tags the class as a source of bean definitions for the application context.
- @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings,
other beans, and various property settings.
- @ComponentScan: Tells Spring to look for other components, configurations, and services in the com/example package,
letting it find the controllers.
*/

@SpringBootApplication
public class StompWebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(StompWebsocketApplication.class, args);
	}

}
