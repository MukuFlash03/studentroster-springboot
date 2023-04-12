package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mukul = new Student(
                    "Mukul C. Mahadik",
                    "mukul@abc.xyz",
                    LocalDate.of(1999, FEBRUARY,3)
                );

            Student barry = new Student(
                    "Barry Allen",
                    "flash@xyz.abc",
                    LocalDate.of(1997, AUGUST,17)
            );

            repository.saveAll(
                    List.of(mukul, barry)
            );
        };
    }
}
