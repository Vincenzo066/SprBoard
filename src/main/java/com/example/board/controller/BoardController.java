package com.example.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {

    //private final BoardService boardService;

    @GetMapping("/board/spr_board")
    public String sprBoardForm(){
        return "spr_board";
    }

}
