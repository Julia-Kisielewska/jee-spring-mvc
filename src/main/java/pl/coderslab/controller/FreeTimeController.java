package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@Controller
public class FreeTimeController {

    @RequestMapping("free-time")
    @ResponseBody
    public String freeTime() {
        String response = "";

        LocalDateTime date = LocalDateTime.now();

//        Aby przetestować działanie aplikacji, możesz zamiast aktualnej daty,
//        pobrać wybraną przez siebie datę i godzinę.
//        LocalDateTime date = LocalDateTime.of(2022, 8, 11, 18, 13);

        String dayOfWeek = String.valueOf(date.getDayOfWeek());
        int hour = date.getHour();


        if (dayOfWeek.equals("SUNDAY") | dayOfWeek.equals("SATURDAY")) {
            response = "WOLNE";
        } else if (hour >= 9 && hour <= 17) {
            response = "Pracuję, nie dzwoń";
        } else {
            response= "Po Pracy";
        }
        return response;
    }
}
