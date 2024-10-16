package com.springapps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapps.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
   public Project findByProjectno(Integer projectno);
}

//implementation for this interface is taken care by data jpa itself