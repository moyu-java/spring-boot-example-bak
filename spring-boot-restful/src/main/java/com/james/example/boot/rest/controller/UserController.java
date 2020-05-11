package com.james.example.boot.rest.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author James
 * @date 2020/5/11
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("")
    public String getUsers() {
        return "列出所有用户，List<User>";
    }

    @GetMapping("/{userId}")
    public String getUser(@PathVariable Long userId) {
        return "获取 UserId 为 " + userId + " 的用户";
    }

    @PostMapping("")
    public String postUser(@RequestParam("user") String user) {
        return "新建  " + user + " 的用户";
    }

    @PutMapping("/{userId}")
    public String putUser(@PathVariable Long userId) {
        return "更新 UserId 为 " + userId + " 的用户";
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable Long userId) {
        return "更新 UserId 为 " + userId + " 的用户";
    }
}