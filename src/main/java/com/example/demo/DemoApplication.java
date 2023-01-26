package com.example.demo;
import java.util.Scanner;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Welcome Shiva!";
	}

	   String message = "Hello, I am ChatGPT. How can I assist you today?";
        String[] words = message.split(" "); // split the message into an array of words
        for (String word : words) {
            try {
                Thread.sleep(500); // wait for half a second before printing the next word
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(word + " ");
        }
}
