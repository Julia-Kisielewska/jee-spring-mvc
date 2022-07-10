package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalTime;

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
    public String helloNames(@PathVariable("firstName") String firstName,
                             @PathVariable("lastName") String lastName) {
        return "Witaj " + firstName + " " + lastName;
    }

    @GetMapping("helloView")
    public String helloView(Model model) {
//        LocalTime now = LocalTime.now();
        LocalTime now = LocalTime.of(21, 0);
        String color, backgroundColor;

        if (now.isAfter(LocalTime.of(8, 0)) && now.isBefore(LocalTime.of(20, 0))) {
            color = "black";
            backgroundColor = "white";
        } else {
            color = "white";
            backgroundColor = "black";
        }

        model.addAttribute("color", color);
        model.addAttribute("backgroudColor", backgroundColor);
        return "home";
    }
}
