package com.springBootDataRest.SpringBoot.Data.Rest.repo;

import com.springBootDataRest.SpringBoot.Data.Rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

     List<JobPost> findByPostProfileContainingOrPostDescContaining(String Profile, String Desc);
}
