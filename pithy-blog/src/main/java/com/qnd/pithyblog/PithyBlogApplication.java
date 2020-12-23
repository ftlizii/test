package com.qnd.pithyblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class PithyBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(PithyBlogApplication.class, args);
    }

}
