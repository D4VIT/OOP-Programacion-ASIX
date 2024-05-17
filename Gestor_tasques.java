import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

class Task {
    private String title;
    private String description;
    private String deadline;
    private String status;

    public Task(String title, String description, String deadline, String status) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return title + "," + description + "," + deadline + "," + status;
    }
}
