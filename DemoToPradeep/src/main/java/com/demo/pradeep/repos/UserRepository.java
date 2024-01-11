package com.demo.pradeep.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pradeep.Models.DemoAPOI;

public interface UserRepository extends JpaRepository<DemoAPOI, Integer>{

}
