
package student;

import computer.Computer;
import course.Course;


public class Student {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    
    private Course course;
    private Computer computer;
    
    
    public Student() {
        this.course = new Course();
        this.computer = new Computer();
    }
    
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    
    
    // gett sett za klase
    
    
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    
    
    
    
    
    public void info () {
        System.out.println("First name: " +getFirstName());
        System.out.println("Last name: " +getLastName());
        System.out.println("Year of birth: " +getYearOfBirth());
        System.out.println("Course name: " +getCourse().getName());
        System.out.println("Nomber of classes" +getCourse().getNumberOfClasses());
        System.out.println("Hard drive: " +getComputer().getHardDrive());
        System.out.println("Memory: " +getComputer().getMemory());
        System.out.println("Process Tact: "+getComputer().getProcessTact());
        
    }
    
}
