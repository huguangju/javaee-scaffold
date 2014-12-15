package com.jediego.jes.modules.sys.user.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin/sys/user")
public class UserController {

    @RequestMapping("/")
    public String index(ModelMap map){
        map.addAttribute("name", "jediego");
        map.addAttribute("msg", "hello world!");
        return "sys/user/userList";
    }
}
