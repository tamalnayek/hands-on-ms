package com.service.emp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.service.emp.model.Employee;
import com.service.emp.repository.EmployeeRepository;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableEurekaClient
public class EmpServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpServiceApplication.class, args);
	}

    @Bean
    CommandLineRunner loadData(EmployeeRepository repository) {
        return (args) -> {
            repository.save(new Employee(1000, "James", "Smith", "1970-01-05", "8 Mile End Road, Carnegie, VIC 3163",
                    "Star Office, Level 3, Desk 10", "0394764512", "Business Manager", 123000, 1628329));
            repository.save(new Employee(1001, "James", "Vesto", "1985-11-23", "8 Mile End Road, Carnegie, VIC 3163",
                    "Freedom Office, Level 11, Desk 25", "0394768356", "Programmer", 87000, 2963492));
            repository.save(new Employee(1002, "Tony", "Kakkar", "1972-02-15", "10 Mile End Road, Carnegie, VIC 3163",
                    "Star Office, Level 3, Desk 10", "0394765522", "Solution Architect", 150000, 7654321));
            repository.save(new Employee(1003, "Adam", "Smith", "1975-03-05", "12 Mile End Road, Carnegie, VIC 3163",
                    "Star Office, Level 3, Desk 10", "0394764411", "Sr. Programmer", 95000, 1234567));
            repository.save(new Employee(1004, "John", "Deere", "1980-02-20", "14 Mile End Road, Carnegie, VIC 3163",
                    "Star Office, Level 3, Desk 10", "0394763321", "Team Lead", 110000, 2345443));
        };
    }

    @Bean
	Sampler alwaysSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
