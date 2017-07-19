package com.kanper.service.impl;

import com.kanper.bean.Question;
import com.kanper.mapper.QuestionMapper;
import com.kanper.service.IQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QuestionServiceImpl implements IQuestionService {
    @Resource
    private QuestionMapper mapper;

    @Override
    public List<Question> getQuestions() {
        return mapper.getRandom();
    }
}
