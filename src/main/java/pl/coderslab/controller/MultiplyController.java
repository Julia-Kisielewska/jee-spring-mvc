package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MultiplyController {

    @GetMapping("multiply")
    public String multiply(@RequestParam(name = "size", defaultValue = "10")
                           String size,
                           Model model) {
        int gridSize = Integer.parseInt(size);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 1; i < gridSize; i++) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int j = 1; j < gridSize + 1; j++) {
                innerList.add(i * j);
            }
            list.add(innerList);
            model.addAttribute("innerNumbers", innerList);
        }

        model.addAttribute("numbers", list);

        return "grid";
    }
}
