import java.util.ArrayList;

public class TaskManager {
    private ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public void updateTask(int index, String newTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newTask);
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.addTask("Task 1");
        tm.addTask("Task 2");
        tm.displayTasks();
        tm.updateTask(1, "Updated Task 2");
        tm.displayTasks();
        tm.removeTask(0);
        tm.displayTasks();
    }
}
