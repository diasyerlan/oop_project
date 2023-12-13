package proj;

public class Mark{

    private double percentage;
    private String letterMark;
    private double GPA;
    private double firstAttestation;
    private double secondAttestation;
    private double finalScore;
    private String gradesLetters;

    // Getters and setters

    public double getPercentage() {
        return this.percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getLetterMark() {
        return this.letterMark;
    }

    public void setLetterMark(String letterMark) {
        this.letterMark = letterMark;
    }

    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getFirstAttestation() {
        return this.firstAttestation;
    }

    public void setFirstAttestation(double firstAttestation) {
        this.firstAttestation = firstAttestation;
    }

    public double getSecondAttestation() {
        return this.secondAttestation;
    }

    public void setSecondAttestation(double secondAttestation) {
        this.secondAttestation = secondAttestation;
    }

    public double getFinalScore() {
        return this.finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    public String getGradesLetters() {
        return this.gradesLetters;
    }

    public void setGradesLetters(String gradesLetters) {
        this.gradesLetters = gradesLetters;
    }

    // Additional methods

    public double calculateFinalExamScore() {
        // TODO: Implement the logic to calculate the final exam score
        return 0.0;
    }

    @Override
    public String toString() {
        // TODO: Implement the logic to represent the object as a string
        return "";
    }
}
