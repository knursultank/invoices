package kz.bat.invoices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class InvoicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoicesApplication.class, args);
		
		System.out.println("Hello world!");
	}
	
}
