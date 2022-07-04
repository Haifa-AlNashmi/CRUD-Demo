package com.API.RestAPI.Repo;
import com.API.RestAPI.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
