package com.rest.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.rest.entities.Api;

public interface ApiDao extends JpaRepository<Api,Integer> {

}
