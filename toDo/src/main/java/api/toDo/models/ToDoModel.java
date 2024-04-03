package api.toDo.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "toDos")
public class ToDoModel {
    @Id
    private String id;
    private String description;
    private boolean done;
    @DBRef
    private UserModel user;
}
