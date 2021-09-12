package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student tarik = new Student("Tarik","tarik.dzambic@gmail.com", LocalDate.of(2000, APRIL,26));
            Student almir = new Student("Almir","almir.subasic@gmail.com", LocalDate.of(2004, MARCH,19));

            repository.saveAll(List.of(tarik,almir));
        };
    }
}
