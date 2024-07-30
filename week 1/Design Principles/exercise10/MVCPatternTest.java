public class MVCPatternTest {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "12345", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        
        controller.updateView();
        
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");
        controller.updateView();
    }
}
