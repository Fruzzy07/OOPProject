package Project;

import java.util.Vector;

public class ResearchProject {
	public String topic;
	public Vector<ResearchPaper> publishedPapers = new Vector<ResearchPaper>();
	public Vector<Researcher> participants = new Vector<Researcher>();
	public ResearchProject(String topic) {
		this.topic=topic;
	}
	public void addParticipants(Researcher r) {
		this.participants.add(r);
	}
	public void addPublishedPapers(ResearchPaper paper) {
		this.publishedPapers.add(paper);
	}
}
