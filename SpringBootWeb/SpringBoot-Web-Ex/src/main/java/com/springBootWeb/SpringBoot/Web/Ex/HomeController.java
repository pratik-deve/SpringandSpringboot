package com.springBootWeb.SpringBoot.Web.Ex;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public ModelAndView addAlien(@RequestParam("aid") int id, @RequestParam("aname") String name, ModelAndView mv){

        String result = Integer.toString(id) + " -> " + name;


        mv.addObject("result", result);

        mv.setViewName("result");

        return mv;
    }


}
