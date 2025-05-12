package com.example.spring_kadai_todo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.spring_kadai_todo.entity.ToDo;
import com.example.spring_kadai_todo.service.ToDoService;

@Controller
public class ToDoController {
	private final ToDoService todoService;

	public ToDoController(ToDoService todoService) {
		this.todoService = todoService;
	}

	@GetMapping("/admintodo")
	public String adminToDo(Model model) {
		List<ToDo> todos = todoService.getAllToDos();

		model.addAttribute("todos", todos);

		return "todoView";
	}

}
