package com.springapps.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springapps.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
   public Project findByProjectno(Integer projectno);
   @Query("SELECT p FROM Project p where p.teamsize between :min and :max")
   public List<Project> readProjectsByTeamSize(@Param("min") Integer min,@Param("max") Integer max);
}

//implementation for this interface is taken care by data jpa itself