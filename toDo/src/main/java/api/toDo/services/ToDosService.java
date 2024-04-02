package api.toDo.services;

import api.toDo.data.ToDosRepository;
import api.toDo.models.ToDoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDosService {
    private final ToDosRepository toDosRepository;

    public ToDosService(ToDosRepository toDosRepository) {
        this.toDosRepository = toDosRepository;
    }


    public List<ToDoModel> getAllToDos() {
        return toDosRepository.findAll();
    }

/*    public void saveToDo(ToDoModel toDoModel) {
        toDosRepository.save(toDoModel);
    }*/

}
