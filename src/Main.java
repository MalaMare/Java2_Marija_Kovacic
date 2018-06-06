
import course.Course;
import student.Student;


public class Main {

    
    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.setFirstName("Marija");
        student1.setLastName("Kovacic");
        student1.setYearOfBirth(1982);
        student1.getCourse().setName("QA");
        student1.getCourse().setNumberOfClasses(16);
        student1.getComputer().setProcessTact(2.4);
        student1.getComputer().setMemory(16.0);
        student1.getComputer().setHardDrive(500);
        student1.info();
        
        
        
        Course kursQA = new Course();
        kursQA.setName("QA");
        
        student1.setCourse(kursQA);
        student1.info();
    }
    
}
