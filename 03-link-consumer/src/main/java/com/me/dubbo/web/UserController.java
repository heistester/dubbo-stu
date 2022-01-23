package com.me.dubbo.web;

import com.me.model.User;
import com.me.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/userDetail")
    public  String userDetail(Model model, Integer id){

        User user=userService.queryuserById(id);
        Integer alluser=userService.queryAllUserCount();

        model.addAttribute("user",user);
        model.addAttribute("allUserCount",alluser);
        return "userDetail";
    }
}
