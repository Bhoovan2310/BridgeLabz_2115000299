class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    private Task head;
    private Task tail;
    private Task currentTask;

    public void addTask(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }

    public void removeTask(int taskId) {
        if (head == null) return;
        if (head.taskId == taskId) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }
        Task temp = head;
        do {
            if (temp.next.taskId == taskId) {
                if (temp.next == tail) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                tail.next = head;
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void viewCurrentTask() {
        if (currentTask == null) {
            currentTask = head;
        }
        if (currentTask != null) {
            System.out.println("Current Task -> ID: " + currentTask.taskId + ", Name: " + currentTask.taskName + ", Priority: " + currentTask.priority + ", Due Date: " + currentTask.dueDate);
            currentTask = currentTask.next;
        }
    }

    public void displayAllTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public Task findTaskByPriority(int priority) {
        if (head == null) return null;
        Task temp = head;
        do {
            if (temp.priority == priority) return temp;
            temp = temp.next;
        } while (temp != head);
        return null;
    }
}

public class TaskSchedulerApp {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(1, "Complete Report", 2, "2025-02-15");
        scheduler.addTask(2, "Prepare Presentation", 1, "2025-02-12");
        scheduler.addTask(3, "Team Meeting", 3, "2025-02-18");

        System.out.println("All Tasks:");
        scheduler.displayAllTasks();

        System.out.println("\nCurrent Task:");
        scheduler.viewCurrentTask();

        System.out.println("\nMoving to Next Task:");
        scheduler.viewCurrentTask();

        System.out.println("\nAfter Removing Task ID 2:");
        scheduler.removeTask(2);
        scheduler.displayAllTasks();

        System.out.println("\nSearching for Task with Priority 3:");
        Task foundTask = scheduler.findTaskByPriority(3);
        if (foundTask != null) {
            System.out.println("Found -> ID: " + foundTask.taskId + ", Name: " + foundTask.taskName + ", Priority: " + foundTask.priority + ", Due Date: " + foundTask.dueDate);
        } else {
            System.out.println("No task found with the given priority.");
        }
    }
}