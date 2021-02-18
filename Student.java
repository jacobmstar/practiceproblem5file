import java.util.ArrayList;

public class Student <E extends Comparable<E>> {
    
    private String name;
    private ArrayList<E> grades;
    
    
    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }
    
    
    public void addGrade(E grade) {
        grades.add(grade);
    }
    
    
    public E getGradeOnAssignment(int i) {
        return grades.get(i-1);
    }
    
    
    public String getName() {
        return name;
    }
}