package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RandomController {

    @RequestMapping("show-random")
    @ResponseBody
    public String showRandom() {
        int rand = (int) (Math.random() * ((100) + 1));
        return "Wylosowano liczbę: wylosowana_" + rand;
    }

    @GetMapping("/random/{min}/{max}")
    @ResponseBody
    public String generateRandom(@PathVariable("min") int min,
                                 @PathVariable("max") int max) {
        int rand = (int) (Math.random() * ((max - min) + min));
        return "Uzytkownik podał liczbę: " + min + " i " + max + ". Wylosowano liczbę: wylosowana_" + rand;
    }
}
