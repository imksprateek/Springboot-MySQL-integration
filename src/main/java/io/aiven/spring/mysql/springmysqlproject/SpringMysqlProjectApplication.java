package io.aiven.spring.mysql.springmysqlproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMysqlProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMysqlProjectApplication.class, args);
	}

}

//use a tool like cURL or Postman to send POST requests with the necessary data. For example, using cURL:
// curl -X POST http://localhost:8080/demo/add -d name="somerandomname" -d email="random@xyz.com"

//Use get requests to get the list of users
//curl http://localhost:8080/demo/all