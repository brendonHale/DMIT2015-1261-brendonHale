package dmit2015.activity7.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Task {

    String id;
    String description;
    TaskPriority priority;
    boolean done;
}
