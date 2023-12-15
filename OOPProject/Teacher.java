package OOPProject;
import java.util.Vector;

public class Teacher extends Employee {
	public UrgencyLevel urgencyLevel;
	public TeacherRank teacherRank;
	public static Vector<Teacher> teachers= new Vector<Teacher>();
	
	public Teacher() {}
	
	public Teacher(String login, String password, Language language, String id, String fullName, int salary, UrgencyLevel urgencyLevel, TeacherRank teacherRank) {
		super(fullName, id, language, fullName, fullName, salary);
		this.urgencyLevel = urgencyLevel;
		this.teacherRank = teacherRank;
		teachers.add(this);
	}
	
    public Vector viewStudents() {
        for (Student cou : Student.students) {
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

	@Override
	public String report(String s) {
		// TODO Auto-generated method stub
		return s;
	}

	@Override
	public String sendMessage(String s) {
		// TODO Auto-generated method stub
		return s;
	}
    
    
}
