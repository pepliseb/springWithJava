package pl.pepliseb.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

@GetMapping("/")
    public String index(ModelMap modelMap){
    modelMap.put("a",5);
    modelMap.put("b",8);
    modelMap.put("word","słowo");
    return "index";
}
        }