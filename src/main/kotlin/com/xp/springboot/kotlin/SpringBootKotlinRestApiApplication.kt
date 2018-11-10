package com.xp.springboot.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.context.annotation.Bean
import com.xp.springboot.kotlin.repository.ParkRunnerRepository
import org.springframework.boot.CommandLineRunner
import com.xp.springboot.kotlin.model.ParkRunner
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.context.ApplicationPidFileWriter


@SpringBootApplication
@ComponentScan(basePackages = arrayOf("com.xp.springboot.*"))
@EnableJpaRepositories("com.xp.springboot.*")
@EntityScan("com.xp.springboot.*")
class SpringBootKotlinRestApiApplication {
	

	@Bean
	fun run(repository : ParkRunnerRepository) = ApplicationRunner {
		
		repository.save(ParkRunner(firstName = "NEERAJ", lastName="SIDHAYE", gender="M",
				                              totalRuns="170", runningClub="RUNWAY"))
	}
}

fun main(args: Array<String>) {
	
    runApplication<SpringBootKotlinRestApiApplication>(*args)
}

fun start() {
	
	runApplication<SpringBootKotlinRestApiApplication>()
}
