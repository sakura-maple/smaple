package com.maple.smaple.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/3/31 15:24
 */
@Controller
@CrossOrigin
@RequestMapping("/my")
public class IndexFreeMakerController {
    static final  Logger logger = LoggerFactory.getLogger(IndexFreeMakerController.class);
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","1231");
        return "indexfreemarker";
    }

    @RequestMapping("/brother")
    public String list(Model model){
//        User user = new User();
//        List<String> userNames = new ArrayList<>();
//        userNames.add("2");
//        userNames.add("3");
//        userNames.add("4");
//        user.setUserNames(userNames);
//        List<User> users = iUserService.selectList(user);
//        model.addAttribute("userList",users);
        return  "brother";
    }
}
