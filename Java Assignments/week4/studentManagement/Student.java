package week4.studentManagement;

public class Student {
    private int id;
    private String name;
    private String course;
    private Module[] modules;//0..4
    private int numModules;

    public Student(String sName) {
        name = sName;
        modules = new Module[4];
        numModules=0;
	}

    public void changeCourse(String nCourse) {
		course = nCourse;
	}

    public String getCourse(){
        return course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int geId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    int getNumModules() {
        return numModules;
    }

    Module[] getModules() {
        return modules;
    }

    public void addModule(Module m) {
        modules[numModules] = m; // at end of array
        numModules++; // one more module 
    }

    // PRE 0<=pos<numModules
    public void deleteModule(int pos) {
        int i = pos;
        while (i<numModules-1) { 
            modules[i] = modules[i+1]; // copy down
            i++;
        } // i == numModules-1
        numModules--; // one less now
    }
}
