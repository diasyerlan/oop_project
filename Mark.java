package proj;

import java.io.Serializable;

public class Mark implements Serializable {
    private static final long serialVersionUID = -6224020856388248737L;
    private double percentage;
    private String letterMark;
    private double GPA;
    private double firstAttestation;
    private double secondAttestation;
    private double finalScore;
    private String gradesLetters;
    public Mark(double firstAttestation, double secondAttestation, double finalScore) {
        this.firstAttestation = firstAttestation;
        this.secondAttestation = secondAttestation;
        this.finalScore = finalScore;
        if(getFirstAttestation()!= 0 && getSecondAttestation()!= 0 && getFinalScore() != 0) {
            letterMark = letterMarkCalculation();
        } else letterMark = "";
    }
    public Mark() {
        this.firstAttestation =  0;
        this.secondAttestation = 0;
        this.finalScore = 0;
        this.letterMark = "";
    }

    public String letterMarkCalculation() {
        double total = getFirstAttestation() + getSecondAttestation() + getFinalScore();
        if(total >= 95) return "A";
        else if(total >= 90 && total <= 94) return "A-";
        else if(total >= 87 && total <= 89) return "B+";
        else if(total >= 83 && total <= 86) return "B";
        else if(total >= 80 && total <= 82) return "B-";
        else if(total >= 77 && total <= 79) return "C+";
        else if(total >= 73 && total <= 76) return "C";
        else if(total >= 70 && total <= 72) return "C-";
        else if(total >= 65 && total <= 69) return "D+";
        else if(total >= 60 && total <= 64) return "D";
        else if(total <= 59) return "F";
        return "";
    }

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