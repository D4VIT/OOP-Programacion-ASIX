import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

public class TaskManager {
    private List<Task> tasks;
    private String fileName;

    public TaskManager(String fileName) {
        this.fileName = fileName;
        this.tasks = new ArrayList<>();
        loadTasks();
    }

    private void loadTasks() {
        File file = new File(fileName);
        if (!file.exists()) {
            return;
        }
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");
                Task task = new Task(fields[0], fields[1], fields[2], fields[3]);
                tasks.add(task);
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }
    }

    private void saveTasks() {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            for (Task task : tasks) {
                fileWriter.write(task.toString() + "\n");
            }
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    public void addTask(Task task) {
        tasks.add(task);
        saveTasks();
    }


    public void modifyTask(int index, Task task) {
        tasks.set(index, task);
        saveTasks();
    }


    public void deleteTask(int index) {
        tasks.remove(index);
        saveTasks();
    }


    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i).getTitle());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.next();
        TaskManager taskManager = new TaskManager(fileName);

        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. Modify task");
            System.out.println("3. Delete task");
            System.out.println("4. Display tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();


        }