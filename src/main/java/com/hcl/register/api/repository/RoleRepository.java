package com.hcl.register.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.register.api.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

}
