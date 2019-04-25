package info.mdhs.mapsy.controller;

import info.mdhs.mapsy.dao.User;
import info.mdhs.mapsy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BaseController
{

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String Home(String name, Model model)
    {
        model.addAttribute("home", "MAPSY");
        return "home";
    }

    @GetMapping("/login")
    public void getLogin()
    {

    }

    @PostMapping("/login")
    public void postLogin()
    {

    }

    @GetMapping("/signup")
    public String getSignUp(String name, Model model)
    {
        model.addAttribute("title", "Signup");
        model.addAttribute("name", "Signup");
        model.addAttribute("email", "Signup");
        model.addAttribute("password", "Signup");
        return "signup";
    }

    @PostMapping("/signup")
    public String postSignUp(@ModelAttribute User user)
    {
        System.out.println(user.getName());
        return "result";
    }

}
