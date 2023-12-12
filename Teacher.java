package projects;
import java.util.Vector;

public class Teacher extends Employee {
	public static Vector<Course> course = new Vector<Course>();
	public UrgencyLevel urgencyLevel;
	public TeacherRank teacherRank;
	
	public Teacher() {}
	
	public Teacher(String id, String fullName, int salary, Vector<Course> course, UrgencyLevel urgencyLevel, TeacherRank teacherRank) {
		super(id, fullName, salary);
		this.course = course;
		this.urgencyLevel = urgencyLevel;
		this.teacherRank = teacherRank;
	}
	
    public Vector<Student> viewStudents() {
        Vector<Student> students = new Vector<Student>();
        for (Course cou : course) {
            students.addAll(cou.accessStudent);
        }
        return students;
    }
	
    public Vector<Course> viewCourses() {
        return course;
    }
    
    public void sendComplaints(Student student, String complaintText) {
        System.out.println("Complaint sent to " + student.fullName + ": " + complaintText);//complainttext какой то стринг жазуга болатындай ету керек
    }
    
    public String sendMessage(Employee employee, String messageText) {
        return "Message sent to " + employee.fullName + ": " + messageText;//messagetext какой то стринг болу керек
    }
    
    public double putMark(Student student, Course course, Mark mark) {
        // For example, find the student in the course and assign the mark
        if (course.accessStudent.contains(student)) {
            mark.course = course;
            mark.grade = 85;//мында оценканы сразу 85 етип койды а если 90 койгысы келсе ше?
            return mark.grade;
        } else {
            System.out.println("Error: Student or course not found.");
            return -1.0;
        }
    }
    
    
}
