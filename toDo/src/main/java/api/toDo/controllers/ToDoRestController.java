package api.toDo.controllers;

import api.toDo.models.ToDoModel;
import api.toDo.services.ToDosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/toDos")
public class ToDoRestController {

    private final ToDosService toDosService;

    public ToDoRestController(ToDosService toDosService) {
        this.toDosService = toDosService;
    }

    @GetMapping
    public List<ToDoModel> getAllToDos() {
        return toDosService.getAllToDos();
    }
}
