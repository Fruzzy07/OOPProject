package projects;

public class Transcript {
	public Course course;
	public Mark mark;
	public double GPA;
	
	public String showTranscript() {
		return " Course name: " + course + " Mark: " + mark + " GPA: " + GPA;
	}
}
