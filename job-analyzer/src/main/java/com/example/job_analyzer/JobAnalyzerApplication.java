package com.example.job_analyzer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import com.example.job_analyzer.service.JobScraperService;

@SpringBootApplication
public class JobAnalyzerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobAnalyzerApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			JobScraperService jobScraperService = ctx.getBean(JobScraperService.class);
			jobScraperService.scrapeJobs(); // Call the method directly
		};
	}
}
