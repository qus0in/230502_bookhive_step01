package io.playdata.bookhive;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LibraryController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Playdata Library");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("pageTitle", "About Playdata Library");
        return "about";
    }

}
