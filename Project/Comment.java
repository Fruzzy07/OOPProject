package Project;

import java.util.Date;

public class Comment {
	public String author;
	public Date dateWritten;
	public String text;
	public Comment(String author, Date dateWritten, String text) {
		this.author=author;
		this.dateWritten=dateWritten;
		this.text=text;
	}
}
