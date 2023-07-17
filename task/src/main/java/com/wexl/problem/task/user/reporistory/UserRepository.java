package com.wexl.problem.task.user.reporistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wexl.problem.task.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
