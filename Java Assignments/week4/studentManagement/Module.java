package week4.studentManagement;

public class Module {
    private String name;
    private String id;
    private int numStudents;//0..30
    private Student[] students = new Student[30];
    
    public Module(String name, String id){
        this.name = name;  
        this.id = id;
    }

    public String getName(){
        return name;
    }
    
    public String getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setId(String id){
        this.id = id;
    }

    public int getNumberStudents(){
        return numStudents;
    }

    public Student[] getStudents(){
        return students;
    }
    
    public void addStudent(Student s) {
        students[numStudents] = s; // at end of array
        numStudents++; // one more module 
    }
    
    public void deleteStudent(int pos) {
        int i = pos;
        while (i<numStudents-1) { 
        students[i] = students[i+1]; // copy down
        i++;
        } // i == numModules-1
        numStudents--; // one less now
    }
    
    public Student[] getRegister(){
        return students;
    }
}