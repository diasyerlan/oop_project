package proj;

import java.util.Comparator;

public class Comp {
    public static Comparator<ResearchPaper> dateComparator = Comparator.comparing(ResearchPaper :: getYear );
    public static Comparator<ResearchPaper> citationComparator = Comparator.comparing(ResearchPaper :: getCitationNum);
    public static Comparator<ResearchPaper> articleLengthComparator = Comparator.comparing(ResearchPaper :: getArticleSize);
    public static Comparator<ResearchPaper> authorsNumComparator = Comparator.comparing(ResearchPaper :: getAuthorsNum);
    public static Comparator<ResearchPaper> titleComparator = Comparator.comparing(ResearchPaper :: getTitle);
    public static Comparator<ResearchPaper> keywordsNumComparator = Comparator.comparing(ResearchPaper :: getKeywordsNum);
    public static Comparator<ResearchPaper> abstractLengthComparator = Comparator.comparing(ResearchPaper :: getAbstractSize);


}
