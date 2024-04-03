package api.toDo.controllers;

import api.toDo.models.UserModel;
import api.toDo.services.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserRestController {
    private final UsersService usersService;

    public UserRestController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/{id}")
    public UserModel getUser(@PathVariable("id") String id) {
        return usersService.getUserById(id);
    }
    @PostMapping
    public ResponseEntity<UserModel> createToDo(@RequestBody UserModel userModel) {
        try {
            UserModel savedUser = usersService.saveUser(userModel);
            return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
