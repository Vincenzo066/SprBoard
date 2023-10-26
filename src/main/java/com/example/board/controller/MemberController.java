package com.example.board.controller;

import com.example.board.dto.MemberDTO;
import com.example.board.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.lang.reflect.Member;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/board/login")
    public String loginForm(){
        return "login";
    }

    @PostMapping("/board/login")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session){
        MemberDTO loginResult = memberService.login(memberDTO);
        if(loginResult != null){
            session.setAttribute("loginNic", loginResult.getMemberNic());
            session.setAttribute("loginGd", loginResult.getMemberGd());
            return "redirect:/";
        }
        return "login";
    }

    @GetMapping("/board/register")
    public String regForm(){
        return "register";
    }

    @PostMapping("/board/register")
    public String register(@ModelAttribute MemberDTO memberDTO){
        memberService.register(memberDTO);
        return "index";
    }
}
