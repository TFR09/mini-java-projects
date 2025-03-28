package week4.studentManagement;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        Student student2 = new Student("Emma");
        Module mod1 = new Module ("OO Programming", "COMP4005");
    
        student1.addModule(mod1);
        student2.addModule(mod1);
        mod1.addStudent(student1);
        
        Student[] students = new Student[30];
        students = mod1.getRegister();
        System.out.println(students);
    }
}
