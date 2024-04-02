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

    public ToDoModel saveToDo(ToDoModel toDoModel) {
        return toDosRepository.save(toDoModel);
    }

    public void deleteToDoById(String id) {
        toDosRepository.deleteById(id);
    }

    public ToDoModel updateToDoById(String id, ToDoModel toDoModel) {
        ToDoModel toDo = toDosRepository.findById(id).orElse(null);
        if (toDo == null) {
            return null;
        }
        toDo.setDescription(toDoModel.getDescription());
        toDo.setDone(toDoModel.isDone());
        return toDosRepository.save(toDo);
    }

}
