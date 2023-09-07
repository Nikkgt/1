package com.untitled;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView(){
        return "myView";
    }
    @RequestMapping("/askName")
    public String askUserName(){
        return "ask-user-name-view";
    }
    @RequestMapping("showName")
    public String showUserName(HttpServletRequest request, Model model){
        return "show-user-name-view";
    }
}
