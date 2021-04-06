package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
//@RestController
@Controller
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
//@GetMapping("/hello")
//    public String helloCodeGym(@RequestParam(value = "myName",defaultValue = "CodeGym")String name){
//        return String.format("Hello + %s!",name);
//}
 @RequestMapping(value = {"/index"},method = RequestMethod.GET)
 public String helloCodeGym(Model model){
        String status = "Hello CodeGym";
        model.addAttribute("messager",status);
        return "index";
 }
}
