package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/first")
public class FormController {

    @GetMapping("/form")
    public String hello() {
        return "/first/form.jsp";
    }

    @PostMapping("/form")
    @ResponseBody
    public String helloResponse(@RequestParam(name = "paramName") String paramName,
                                @RequestParam(name = "paramDate") String paramDate) {
//        String[]date = paramDate.split(" ");
//        int year = Integer.parseInt(date[0]);
//        int month = Integer.parseInt(date[1]);
//        int day = Integer.parseInt(date[2]);
//
//        LocalDate time = LocalDate.of(year, month,day);

        return paramName + " " + paramDate;
//        return paramName + " " + time;
    }

}
