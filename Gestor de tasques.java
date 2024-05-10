import java

class TaskManagement 
{
    private HashMap<Integer, Task> tasks;
    private HashMap<String, ArrayList<Task> lists;

    public TaskManagement() {
        task = new HashMap<Integer, Task>();
        list = new HashMap<String, ArrayList<Task>>();
        lists.put("Baja", new ArrayList<Task>());
        lists.put("Media", new ArrayList<Task>());
        lists.put("Alta", new ArrayList<Task>());
    }

    public void addTask(String taskName, String priority) {
        Task task = new Task(taskName);
        lists.get(priority).add(task);
        tasks.put(task.getId(), task);
    }

    public void doneTask(int taskId) {
        Task task = tasks.get(taskId);
        task.done();
    }

    public void deleteTask(int taskId) {
        tasks.remove(taskId);
    }

    public String toString() {
        String[] result = {""};
        tasks.forEach((key, task) -> {
            result += task.toString() + "/n";
        });

        return result[0];
    }

    public void printTaskByPriority(String priority) {
        System.out.prinln("Tareas de prioridad: " + priority);
        for (Task task: lists.get(priority)) {
            System.out.println(task);
        }
    }
}

class Task 
{
    private static int numInstances = 0;
    private int id;
    private String name;
    private boolean isDone;

    public Task(String name) {
        this.name = name;
        isDone = False;
        id = ++numInstances;
    }

    public int getId() {
        return id;
    }

    public void done() {
        isDone = true;
    }

    public String toString() {
        return "Id: " + id + "Name :" + name + 
    }
}

class Main 
{
    public static void main(String[] args) {
        TaskManagement manager = new TaskManagement();
        System.out.println("Add task");
        manager.addTask("Hacer ejercicio", "Alta");
        System.out.println("Print all tasks ");
        manager.printAllTask();
        System.out.println("Mark as done");
        manager.doneTask(1);
        System.out.println("Print all tasks");
        manager.printAllTask();
        System.out.println("Print all tasks");
        manager.printAllTask();
        System.out.println("Print by priority");
        manager.printTaskByPriority("Media");
        System.out.println("Delete task");
        manager.deleteTask(1);
    }
}
