package com.example.madang.controller;

import com.example.madang.dao.MemberDAO;
import com.example.madang.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/member")
public class MemberController {
    @Autowired
    private MemberDAO dao;

    @GetMapping
    public List<Member> list(){
        return dao.findAll();
    }
}
