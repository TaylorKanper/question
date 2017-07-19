package com.kanper.controller;

import com.kanper.bean.Question;
import com.kanper.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private IQuestionService service;
    @RequestMapping("/getAll")
    public List<Question> getRandomQuestion(){
        return service.getQuestions();
    }
}
