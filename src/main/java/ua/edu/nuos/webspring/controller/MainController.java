package ua.edu.nuos.webspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.edu.nuos.webspring.model.User;
import ua.edu.nuos.webspring.model.Zadacha;

/**
 * Created by Eugeny on 11.10.2016.
 */
@Controller
public class MainController {

    @GetMapping(value = "/")
    public ModelAndView main() {
        User user = new User("Иванов", 100);
        return new ModelAndView("index").addObject("user", user).addObject("zadacha", new Zadacha(0,1,0.1));
    }

    @PostMapping(value = "tabulation")
    public ModelAndView tabul(@ModelAttribute Zadacha zadacha) {
        return new ModelAndView("tabulation").addObject("zadacha", zadacha);
    }
}
