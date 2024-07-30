public class TaskManagement {
    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
        }
    }

    private Node head = null;

    public static void main(String[] args) {
        TaskManagement taskManagement = new TaskManagement();
        taskManagement.addTask(new Task("001", "Task 1", "Pending"));
        taskManagement.addTask(new Task("002", "Task 2", "In Progress"));
        taskManagement.addTask(new Task("003", "Task 3", "Completed"));

        taskManagement.displayTasks();
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteTask(String taskId) {
        if (head == null) return;

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId().equals(taskId)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void displayTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}
