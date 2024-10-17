package com.springapps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapps.entities.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
   public Application getByApplicationno(Integer appicationno);
}
