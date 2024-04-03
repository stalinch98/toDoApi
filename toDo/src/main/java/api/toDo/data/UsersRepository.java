package api.toDo.data;

import api.toDo.models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<UserModel, String> {
}
