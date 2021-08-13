package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
          Student navneet =  new Student(
                    1L,
                    "Navneet",
                    "navneetsingh969@gmail.com",
                    LocalDate.of(2001, Month.MARCH,15)
            );
            Student dhruv =  new Student(
                    2L,
                    "Dhruv",
                    "Dhruv@gmail.com",
                    LocalDate.of(2005, Month.JUNE,15)
            );

            repository.saveAll(
                    List.of(navneet,dhruv)
            );
        };
    }

}
