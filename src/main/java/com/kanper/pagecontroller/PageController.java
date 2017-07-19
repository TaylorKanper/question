package com.kanper.pagecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/questionPage")
    public String question(){
        return "question";
    }
    @RequestMapping("/finishPage")
    public String finalPage(){
        return "finish";
    }
}
