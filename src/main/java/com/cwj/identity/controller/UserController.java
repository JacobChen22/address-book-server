package com.cwj.identity.controller;

import com.cwj.identity.model.User;
import com.cwj.identity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author cwj
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/orgId/{orgId}")
    public List<User> findUserByOrgId(@PathVariable("orgId") String orgId) {
        return userService.findUserByOrgId(orgId);
    }

    @GetMapping("/search")
    public List<User> findUserByKeyWord(@RequestParam("keyWord") String keyWord) {
        return userService.findUserByKeyWord(keyWord);
    }

}
