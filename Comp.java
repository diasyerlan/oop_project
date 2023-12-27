package proj;

import java.util.Comparator;
/**
 * A utility class containing static comparators for sorting ResearchPaper objects.
 */
public class Comp {
    /**
     * Comparator to compare ResearchPaper objects based on publication year.
     */
    public static Comparator<ResearchPaper> dateComparator = Comparator.comparing(ResearchPaper :: getYear );
    /**
     * Comparator to compare ResearchPaper objects based on citation number.
     */
    public static Comparator<ResearchPaper> citationComparator = Comparator.comparing(ResearchPaper :: getCitationNum);
    /**
     * Comparator to compare ResearchPaper objects based on article length.
     */
    public static Comparator<ResearchPaper> articleLengthComparator = Comparator.comparing(ResearchPaper :: getArticleSize);
    /**
     * Comparator to compare ResearchPaper objects based on the number of authors.
     */
    public static Comparator<ResearchPaper> authorsNumComparator = Comparator.comparing(ResearchPaper :: getAuthorsNum);
    /**
     * Comparator to compare ResearchPaper objects based on title.
     */
    public static Comparator<ResearchPaper> titleComparator = Comparator.comparing(ResearchPaper :: getTitle);
    /**
     * Comparator to compare ResearchPaper objects based on the number of keywords.
     */
    public static Comparator<ResearchPaper> keywordsNumComparator = Comparator.comparing(ResearchPaper :: getKeywordsNum);
    /**
     * Comparator to compare ResearchPaper objects based on abstract length.
     */
    public static Comparator<ResearchPaper> abstractLengthComparator = Comparator.comparing(ResearchPaper :: getAbstractSize);


}
