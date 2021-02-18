class Main {
  public static void main(String[] args) {
    Student<Integer> student1 = new Student<>("Alice");
    student1.addGrade(90);
    student1.addGrade(100);
    student1.addGrade(85);
    int assignment2Grade = student1.getGradeOnAssignment(2);
    System.out.println(student1.getName() + " got a " +   
      assignment2Grade + " on the second assignment.");

    Student<Double> student2 = new Student<>("Bob");
    student2.addGrade(82.7);
    student2.addGrade(64.2);
    student2.addGrade(91.7);
    student2.addGrade(70.4);
    double assignment1Grade = student2.getGradeOnAssignment(1);
    System.out.println(student2.getName() + " got a " + 
      assignment1Grade + " on the first assignment.");
  }
}

    
    
    
    
    
    
     
    