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

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Hey there home here!!");
        return "index";
    }



    @RequestMapping("addAlien")

    //public String addAlien(int aid, String aname, HttpSession session) -> this also works correct for below

    //We can make the use of model instead of session
    public String addAlien(@RequestParam("aid") int id, @RequestParam("aname") String name, Model model){

        String result = Integer.toString(id) + " -> " + name;

        System.out.println(result);
        model.addAttribute("result", result);
        return "result";
    }


//    @RequestMapping("addAlien")
//    public String addAlien(HttpServletRequest req, HttpSession session){
//
//        int num = Integer.parseInt(req.getParameter("aid"));
//        String name = req.getParameter("aname");
//
//        String result = Integer.toString(num) + " -> " + name;
//
//        System.out.println(result);
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }
}
