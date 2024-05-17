import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

class Task {
    private String title;
    private String description;
    private String deadLine;
    private String status;

    public Task(String title, String description, String deadline, String status) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.status = status;
    }
}
