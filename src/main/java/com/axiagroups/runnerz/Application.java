package com.axiagroups.runnerz;

import com.axiagroups.runnerz.run.Location;
import com.axiagroups.runnerz.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		// 00.48.35
		SpringApplication.run(Application.class, args);

		log.info("Hello spring");

	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1,
					"Yoo",
					LocalDateTime.now(),
					LocalDateTime.now().plus(1, ChronoUnit.HOURS),
					5,
					Location.INDOOR);
			log.info("Run: " + run);
		};
	}
}
