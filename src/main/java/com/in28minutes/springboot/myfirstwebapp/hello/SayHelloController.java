package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SayHelloController {

    // say hello => "Hello! What are you learning today?"
    // say hello
    // localhost:8080/say-hello
    
    @RequestMapping("say-hello")
    //the controller is looking for a view and you will need to provide a response instead
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }


    @RequestMapping("say-hello-html")
    //the controller is looking for a view and you will need to provide a response instead
    @GetMapping(value = "/index")
    @ResponseBody
    public String sayHelloHTML() {
        //will add the view later - JSP
        // comment for now
        return "index";
    }
}
