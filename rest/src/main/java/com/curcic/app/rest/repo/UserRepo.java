package com.curcic.app.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curcic.app.rest.models.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
