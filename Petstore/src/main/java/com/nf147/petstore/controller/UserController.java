package com.nf147.petstore.controller;


import com.nf147.petstore.dao.UsersMapper;
import com.nf147.petstore.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.registry.infomodel.User;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UsersMapper usersMapper;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String insert(Users users) {
        usersMapper.insert(users);
        return "{\"msg\":\"添加成功\"}";
    }

    @RequestMapping(value = "/createWithArray", method = RequestMethod.POST)
    public String createWithArray() {
        return "";
    }

    @RequestMapping(value = "/createWithList", method = RequestMethod.POST)
    public String createWithList() {
        return "";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        return "";
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getByName(@RequestParam("userName") String usersName, Model model) {
        Users users = usersMapper.getByName(usersName);


        model.addAttribute("users", users);
        return "{\"msg\":\"成功\"}";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String update(Users users) {
        usersMapper.updateByPrimaryKey(users);
        return "";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String deleteByName(@RequestParam("userName") String userName) {
        usersMapper.deleteByName(userName);
        return "";
    }
}
