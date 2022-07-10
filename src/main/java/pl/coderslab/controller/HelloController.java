package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("hello")
//można pisać adres bez "/" i też zadziała
//    @RequestMapping(path = "/hello", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
//        return "<h1>Hello World</h1>";
    }

    @RequestMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String helloNames(@PathVariable("firstName")String firstName,
                             @PathVariable("lastName") String lastName){
        return "Witaj " + firstName + " " + lastName;
    }
}
