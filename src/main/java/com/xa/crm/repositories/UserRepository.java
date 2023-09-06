package com.xa.crm.repositories;

import com.xa.crm.models.DimUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<DimUser, Integer> {



}