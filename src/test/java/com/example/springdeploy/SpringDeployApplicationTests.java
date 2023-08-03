package com.example.springdeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//SpringBoot Test
@SpringBootTest
class SpringDeployApplicationTests {

	@Test
	void contextLoads() {
		//Funcion para ver las variables de entorno
		System.getenv().forEach(
				(key, value)-> System.out.println(key+" "+value)
		);}

}
