package com.kanper.bean;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
@Data
@Alias("question")
public class Question implements Serializable{
    private int id;
    private String question;
    private String ansA;
    private String ansB;
    private String ansC;
    private String ansD;
    private int rightAns;
}
