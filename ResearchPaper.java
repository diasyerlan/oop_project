package proj;

import java.io.Serializable;
import java.util.Date;
import java.util.Vector;

public class ResearchPaper implements Serializable {
    private static final long serialVersionUID = 231103178251701171L;
    private String article;
    private String title;
    private Vector<String> authors;
    private String abstractText;
    private Vector<String> citations;
    private Vector<String> keywords;
    private int year;
    public ResearchPaper(String title, String article, Vector<String> authors, String abstractText, Vector<String> citations,  Vector<String> keywords, int year) {
        this.title = title;
        this.article = article;
        this.authors = authors;
        this.abstractText = abstractText;
        this.citations = citations;
        this.keywords = keywords;
        this.year = year;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Title: ").append(title).append("\n");
        stringBuilder.append("Authors: ").append(authors).append("\n");
        stringBuilder.append("Abstract: ").append(abstractText).append("\n");
        stringBuilder.append("Citations: ").append(citations).append("\n");
        stringBuilder.append("Keywords: ").append(keywords).append("\n");
        stringBuilder.append("Year: ").append(year);

        return stringBuilder.toString();
    }
    public int getAbstractSize() {
        return getAbstractText().length();
    }
    public int getKeywordsNum() {
        return getKeywords().size();
    }
    public int getAuthorsNum() {
        return getAuthors().size();
    }
    public int getArticleSize() {
        return getArticle().length();
    }
    public int getCitationNum() {
        return citations.size();
    }
    public String getTitle() {
        return title;
    }

    public String getAbstractText() {
        return abstractText;
    }

    public Vector<String> getAuthors() {
        return authors;
    }

    public Vector<String> getCitations() {
        return citations;
    }

    public Vector<String> getKeywords() {
        return keywords;
    }

    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }

    public void setAuthors(Vector<String> authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void setCitations(Vector<String> citations) {
        this.citations = citations;
    }

    public void setKeywords(Vector<String> keywords) {
        this.keywords = keywords;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }
}
