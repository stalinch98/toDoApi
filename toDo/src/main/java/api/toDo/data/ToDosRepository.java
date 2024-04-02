package api.toDo.data;

import api.toDo.models.ToDoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDosRepository extends MongoRepository<ToDoModel, String> {
}
