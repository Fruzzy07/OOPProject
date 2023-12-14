package Project;
import java.util.Comparator;

public class Comparators {
    public static Comparator<ResearchPaper> sortByDate() {
   	return Comparator.comparing(ResearchPaper::getDate);
    }
    
    public static Comparator<ResearchPaper> sortByCitations() {
   	 return Comparator.comparingInt(ResearchPaper::getCitations).reversed();
    }
}
