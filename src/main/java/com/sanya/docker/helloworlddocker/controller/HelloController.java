/**
 * 
 */
package com.sanya.docker.helloworlddocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sanya_s
 *
 */
@RestController
public class HelloController {
	
	@GetMapping("/hello/docker")
	public String getHelloMessage(){
		return "Hello Docker App is Up";
	}

}
