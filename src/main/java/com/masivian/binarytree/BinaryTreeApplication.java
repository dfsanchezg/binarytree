package com.masivian.binarytree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The spring boot main application
 *
 * @author Diego Sánchez
 * @date 14/10/2019
 */
@EnableSwagger2
@SpringBootApplication
public class BinaryTreeApplication {

	/**
	 * The spring boot starter method
	 * @param args the args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BinaryTreeApplication.class, args);
	}

}
