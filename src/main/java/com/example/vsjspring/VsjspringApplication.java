package com.example.vsjspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VsjspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(VsjspringApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value="name", defaultValue = "vishal") String name, @RequestParam(value="address", defaultValue = "kumar") String address){
		return  String.format("name=%s Address=%s",name,address);
	}
	@GetMapping("/Minus")
	public String Minus(@RequestParam(value="num1", defaultValue="45") int num1,@RequestParam(value = "num2",defaultValue = "25") int num2,@RequestParam(value="command",defaultValue="Minus") String command){
		if(command.equals("Add"))
			return String.format("%s",num1+num2);
		return String.format("%s",num1-num2);
	}

	@GetMapping("/change_num")
	public String change_num(@RequestParam(value="num", defaultValue="45") int num){
		return String.format("%d",num);
	}

	@GetMapping("/Add")
	public String Add(@RequestParam(value="num1", defaultValue="45") int num1,@RequestParam(value = "num2",defaultValue = "25") int num2,@RequestParam(value="command",defaultValue="Add") String command){
		return String.format("%s",num1+num2);
	}

	@GetMapping("/tested")
	public  String firstHandler(){
		return "Just for testing!!";
	}

	@RequestMapping("/Test")
	public String secondHandler(){
		return "testing 2";
	}

}
