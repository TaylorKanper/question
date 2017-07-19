package com.kanper.mapper;

import com.kanper.bean.Question;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface QuestionMapper {
    List<Question> getRandom();
}
