package api.toDo.controllers;

import api.toDo.models.ToDoModel;
import api.toDo.services.ToDosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/to-dos")
public class ToDoRestController {

    private final ToDosService toDosService;

    public ToDoRestController(ToDosService toDosService) {
        this.toDosService = toDosService;
    }

    @GetMapping
    public List<ToDoModel> getAllToDos() {
        return toDosService.getAllToDos();
    }

    @PostMapping
    public ResponseEntity<ToDoModel> createToDo(@RequestBody ToDoModel toDoModel) {
        try {
            ToDoModel savedToDo = toDosService.saveToDo(toDoModel);
            return new ResponseEntity<>(savedToDo, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteToDoById(@PathVariable("id") String id) {
        try {
            toDosService.deleteToDoById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
