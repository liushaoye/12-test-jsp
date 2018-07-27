package com.springboot.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/******************************
 * @author : liuyang
 * <p>ProjectName:12-jsp  </p>
 * @ClassName :  MyController
 * @date : 2018/7/27 0027
 * @time : 21:48
 * @createTime 2018-07-27 21:48
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Controller
public class MyController {

    @RequestMapping("/my/index")
    public String index(Model model) {
        model.addAttribute("say","去你妈的");
        return "index";
    }
}
