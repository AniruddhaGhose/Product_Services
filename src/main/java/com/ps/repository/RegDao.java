package com.ps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ps.entity.Registration;

@Repository("regDao")
public interface RegDao extends JpaRepository<Registration, Integer> {

}
