package Project;

import java.util.Date;

public class ResearchPaper {
	public String title;
	public String author;
	public int pages;
	public Date date;
	public String citation;
	public ResearchPaper(String title, String author,int pages, Date date, String citation) {
		this.title=title;
		this.author=author;
		this.pages=pages;
		this.date=date;
		this.citation=citation;
	}
	
	public String getCitation(Format f2){
		return "";
	}
	public int getCitations() {
        return 0;
    }
	
    public String getDate() {
        return null;
    }

}
