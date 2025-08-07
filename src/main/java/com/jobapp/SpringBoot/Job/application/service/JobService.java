package com.jobapp.SpringBoot.Job.application.service;


import com.jobapp.SpringBoot.Job.application.model.JobPost;
import com.jobapp.SpringBoot.Job.application.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getJobs(){
        return repo.getJobs();
    }
}
