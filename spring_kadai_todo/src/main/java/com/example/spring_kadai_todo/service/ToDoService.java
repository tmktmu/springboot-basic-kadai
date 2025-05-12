package com.example.spring_kadai_todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring_kadai_todo.entity.ToDo;
import com.example.spring_kadai_todo.repository.ToDoRepository;

@Service
public class ToDoService {
	private final ToDoRepository todoRepository;
	
	//依存性の注入
	public ToDoService(ToDoRepository todoRepository) {
		this.todoRepository=todoRepository;
	}
	
	//一括取得メソッド
	public List<ToDo> getAllToDos() {
		return todoRepository.findAll();
	}

}
