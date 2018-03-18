package pl.pepliseb.demo.controller;


import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.pepliseb.demo.model.Person;

@Controller
public class PersonController {

@GetMapping("/person")
    public String show(ModelMap modelMap){
    modelMap.addAttribute("person", new Person("Adam", "Nowak"));
    return "person";
    }
}
