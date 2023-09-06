package com.xa.crm.repositories;

import com.xa.crm.models.DimUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<DimUser, Integer> {




}