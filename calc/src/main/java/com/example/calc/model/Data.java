package com.example.calc.model;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table
public class Data implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Question")
    private String question;

    @Column(name = "Answere")
    private String answer;
//
//    @Column(name = "created_date", nullable = false, updatable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    protected Date createdDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

//    public Date getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }



}