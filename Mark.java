package proj;

public class Mark extends Teacher {
    
    private double percentage;
    private String letterMark;
    private double GPA;
    private double firstAttestation;
    private double secondAttestation;
    private double finalScore;
    private String gradesLetters;

    private double getPercentage() {
        return this.percentage;
    }

    private double setPercentage(double percentage) {
        this.percentage = percentage;
    }


    private void setLetterMark(String letterMark) {
        this.letterMark = letterMark;
    }

    public double getGPA() {
        return GPA;
    }

    private Real setGPA(Real GPA) {
        this.GPA = GPA;
    }

    private Real getFirstAttestation() {
        return this.firstAttestation;
    }

    private Real setFirstAttestation(Real firstAttestation) {
        this.firstAttestation = firstAttestation;
    }

    private Real getSecondAttestation() {
        return this.secondAttestation;
    }

    private Real setSecondAttestation(Real secondAttestation) {
        this.secondAttestation = secondAttestation;
    }

    private double getFinalScore() {
        return this.finalScore;
    }

    private void setFinal(double finalScore) {
        this.finalScore = finalScore;
    }

    private String getGradesLetters() {
        return this.gradesLetters;
    }

    private String setGradesLetters(String gradesLetters) {
        this.gradesLetters = gradesLetters;
    }

    public double getPercentage() {
        return 0;
    }


    public String getLetterMark() {
        return "";
    }

    public void setLetterMark(String letterMark) {
        this.letterMark = letterMark;
    }

    public double getGPA() {
        return 0;
    }

    public void setGPA() {
        return null;
    }

    public double getFirstAtt() {
        return null;
    }

    public void setFitstAtt() {
        return null;
    }

    public double getSecondAtt() {
        return null;
    }

    public void setSecondAtt() {
        return null;
    }

    public double getFinalExam() {
        return null;
    }

    public void setFinal() {
        return null;
    }

    public String toSttring() {
        return "";
    }
}
