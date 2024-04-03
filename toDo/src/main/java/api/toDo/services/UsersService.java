package api.toDo.services;

import api.toDo.data.UsersRepository;
import api.toDo.models.UserModel;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UserModel getUserById(String id) {
        return usersRepository.findById(id).orElse(null);
    }

    public UserModel saveUser(UserModel userModel) {
        return usersRepository.save(userModel);
    }
}
