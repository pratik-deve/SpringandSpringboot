package com.springBootWeb.SpringBoot.Web.Ex;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Hey there home here!!");
        return "index";
    }



    @RequestMapping("addAlien")

    // @ModelAttribute is optional even not used works fine
    public String addAlien(@ModelAttribute Alien alien){

        return "result";
    }


}
