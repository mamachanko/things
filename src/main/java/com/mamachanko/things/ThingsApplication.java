package com.mamachanko.things;

import java.util.stream.Stream;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@SpringBootApplication
public class ThingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThingsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ThingRepository thingRepository) {
		return args -> Stream.of(
				new Thing("Coffee"),
				new Thing("Rice"),
				new Thing("Sun")
		).forEach(thingRepository::save);
	}

}

@Entity
class Thing {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	public Thing() {
	}

	public Thing(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Thing(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

@RepositoryRestResource
interface ThingRepository extends PagingAndSortingRepository<Thing, Long> {

}
