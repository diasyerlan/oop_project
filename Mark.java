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
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getLetterMark() {
        return letterMark;
    }

    public void setLetterMark(String letterMark) {
        this.letterMark = letterMark;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getFirstAttestation() {
        return firstAttestation;
    }

    public void setFirstAttestation(double firstAttestation) {
        this.firstAttestation = firstAttestation;
    }

    public double getSecondAttestation() {
        return secondAttestation;
    }

    public void setSecondAttestation(double secondAttestation) {
        this.secondAttestation = secondAttestation;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    public String getGradesLetters() {
        return gradesLetters;
    }

    public void setGradesLetters(String gradesLetters) {
        this.gradesLetters = gradesLetters;
    }

    // Additional methods

    public double calculateFinalExamScore() {

        double finalScore = firstAttestation + secondAttestation;
        return finalScore;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "percentage=" + percentage +
                ", letterMark='" + letterMark + '\'' +
                ", GPA=" + GPA +
                ", firstAttestation=" + firstAttestation +
                ", secondAttestation=" + secondAttestation +
                ", finalScore=" + finalScore +
                ", gradesLetters='" + gradesLetters + '\'' +
                '}';
    }
}