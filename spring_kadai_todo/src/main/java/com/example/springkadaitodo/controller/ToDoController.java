package com.example.springkadaitodo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.service.ToDoService;

@Controller
public class ToDoController {
    
    @Autowired
    private ToDoService toDoService;

    // /todo にアクセスした時にToDoリストを表示する
    @GetMapping("/todo")
    public String showToDoList(Model model) {
        // ToDoリストをサービスから取得
        List<ToDo> toDoList = toDoService.getAllToDos();

        // モデルにデータを渡す
        model.addAttribute("todos", toDoList);

        // todoView.html を返す
        return "todoView";
    }
}
