package com.springBootDataRest.SpringBoot.Data.Rest.repo;

import com.springBootDataRest.SpringBoot.Data.Rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JopRepo extends JpaRepository<JobPost, Integer> {

}
