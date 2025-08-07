package com.jobapp.SpringBoot.Job.application.controller;


import com.jobapp.SpringBoot.Job.application.model.JobPost;
import com.jobapp.SpringBoot.Job.application.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping({"/", "home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    //Name of variable doesn't matter just type
    public String handleForm(JobPost jobPosted){

        service.addJob(jobPosted);
        return "success";
    }


    @GetMapping("viewalljobs")
    public String viewalljobs(Model m){

        List<JobPost> jobs = service.getJobs();

        m.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }





}
