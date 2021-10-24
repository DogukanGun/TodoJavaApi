package com.appcent.todo.controller;


import com.appcent.todo.model.dto.TodoListElementDto;
import com.appcent.todo.model.request.CreateUpdateTodoListElementRequest;
import com.appcent.todo.model.request.CreateUpdateTodoListRequest;
import com.appcent.todo.service.TodoListElementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("todo-list-element")
public class TodoListElementController {

    private final TodoListElementService todoListElementService;

    @PostMapping
    public TodoListElementDto createTodoListElement(@RequestBody CreateUpdateTodoListElementRequest createUpdateTodoListElementRequest){
        return todoListElementService.createTodoListElement(createUpdateTodoListElementRequest);
    }

    @GetMapping("{id}")
    public TodoListElementDto getTodoListElement(@PathVariable int id){
        return todoListElementService.getTodoListElementDto(id);
    }

    @PatchMapping("set-status-pending/{id}")
    public TodoListElementDto setStatusPending(@PathVariable int id){
        return todoListElementService.setStatusPending(id);
    }

    @PatchMapping("set-status-done/{id}")
    public TodoListElementDto setStatusDone(@PathVariable int id){
        return todoListElementService.setStatusDone(id);
    }

    @PatchMapping("set-status-progress/{id}")
    public TodoListElementDto setStatusProgress(@PathVariable int id){
        return todoListElementService.setStatusInProgress(id);
    }

    @PutMapping("{id}")
    public TodoListElementDto updateTodoListElement(@PathVariable int id,@RequestBody CreateUpdateTodoListElementRequest createUpdateTodoListElementRequest){
        return todoListElementService.updateTodoListElement(id,createUpdateTodoListElementRequest);
    }



}
