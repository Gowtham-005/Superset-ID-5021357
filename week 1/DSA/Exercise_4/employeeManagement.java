public class EmployeeManagement {
    private static Employee[] employees = new Employee[100];
    private static int count = 0;

    public static void main(String[] args) {
        addEmployee(new Employee("001", "Alice", "Manager", 80000));
        addEmployee(new Employee("002", "Bob", "Engineer", 60000));
        addEmployee(new Employee("003", "Charlie", "Technician", 40000));

        displayEmployees();
    }

    public static void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
        }
    }

    public static void searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                System.out.println(employees[i]);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void displayEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void deleteEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                employees[i] = employees[count - 1];
                employees[count - 1] = null;
                count--;
                break;
            }
        }
    }
}
