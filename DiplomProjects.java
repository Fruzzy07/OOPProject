package projects;

import java.util.Vector;


public class DiplomProjects {
    private String title;
    private Vector<ResearchPaper> publishedPapers = new Vector<ResearchPaper>();

    public DiplomProjects(String title) {
        this.title = title;
    }

    public void addResearchPaper(ResearchPaper paper) {
        publishedPapers.add(paper);
    }

    public void viewResearchPapers() {
        System.out.println("Research Papers for Diploma Project: " + title);
        for (ResearchPaper paper : publishedPapers) {
            System.out.println("Title: " + paper.title);
            System.out.println("Authors: " + paper.author);
            System.out.println("Pages: " + paper.pages);
        }
    }
}
