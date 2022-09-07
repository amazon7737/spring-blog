package com.example.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;



@SpringBootApplication
@RestController
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
    	

  }

 /* @GetMapping("/hello")
  public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
    return String.format("Hello %s!", name);
 } 
*/
 
 @GetMapping("/greeting")
  public String greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model)
  {
    model.addAttribute("name", name);
    return "greeting";

 }

  @RequestMapping(method = RequestMethod.GET , path = "/getMethod")

  public String getRequest() {
    
    return "Hello Spring";
  }







} 
