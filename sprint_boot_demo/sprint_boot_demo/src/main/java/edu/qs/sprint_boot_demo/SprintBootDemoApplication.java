package edu.qs.sprint_boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"pojo_classes","edu.qs.sprint_boot_demo"})
public class SprintBootDemoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SprintBootDemoApplication.class, args);
	}

}
