package com.me.service.web;

import com.me.model.User;
import com.me.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserServiceController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userDetail")
    public String userDetail(Model model, Integer id){
        Integer count= userService.queryAllUserCount();
        User user=userService.queryuserById(id);
        model.addAttribute("allUserCount",count);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
