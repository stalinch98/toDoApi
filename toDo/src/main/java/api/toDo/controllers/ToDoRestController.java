package api.toDo.controllers;

import api.toDo.models.ToDoModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/toDos")
public class ToDoRestController {

    @GetMapping
    public List<ToDoModel> getAllToDos() {
        return null;
    }
}
