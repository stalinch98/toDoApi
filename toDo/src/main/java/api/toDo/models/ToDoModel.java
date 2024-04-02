package api.toDo.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ToDoModel {
    private long id;
    private String description;
    private boolean done;
}
