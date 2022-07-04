package com.API.RestAPI.Controller;


import com.API.RestAPI.Models.User;
import com.API.RestAPI.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class APIcontrollers {


    @GetMapping(value= "/")
    public String getPage(){

        return "Welcome to the Home Page";
    }
    @Autowired
public UserRepo userRepo;

    @GetMapping(value = "/users")
    public List<User> getUsers(){
        return userRepo.findAll();

    }
    @PostMapping(value = "/save")
   public String saveUsers(@RequestBody User user){
        userRepo.save(user);
        return "Saved...";
    }
    @PutMapping(value = "/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){
        User updateUser = userRepo.findById(id).get();
        updateUser.setFirstName(user.getFirstName());
        updateUser.setLastName(user.getLastName());
        updateUser.setAge(user.getAge());
        updateUser.setNationality(user.getNationality());
        updateUser.setEducation(user.getEducation());
        userRepo.save(updateUser);
        return "Updated...";
    }
    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable long id){
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "Deleted user with id number: " +id;
    }
}

