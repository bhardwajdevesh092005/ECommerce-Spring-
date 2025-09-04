package com.spring.ecommerce.Controllers;

import com.spring.ecommerce.Services.UserService;
import com.spring.ecommerce.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Users")
public class UserController {
    private UserService userServ;

    @Autowired
    public void setUserServ(UserService userServ){
        this.userServ = userServ;
    }
    @GetMapping("")
    public String UserController(){
        return "UserController";
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        System.out.println(id);
        return userServ.getUserById(id);
    }
}
