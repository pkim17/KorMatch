public class Point {

    private double agePotentialMatch;
    private double heightPotentialMatch;
    private double salaryPotentialMatch;

    public Point() {
    }

    public Point(int agePotentialMatch, int heightPotentialMatch, int salaryPotentialMatch) {
        this.agePotentialMatch = agePotentialMatch;
        this.heightPotentialMatch = heightPotentialMatch;
        this.salaryPotentialMatch = salaryPotentialMatch;
    }

    public double getAgePotentialMatch() {
        return agePotentialMatch;
    }

    public void setAgePotentialMatch(double agePotentialMatch) {
        this.agePotentialMatch = agePotentialMatch;
    }

    public double getHeightPotentialMatch() {
        return heightPotentialMatch;
    }

    public void setHeightPotentialMatch(double heightPotentialMatch) {
        this.heightPotentialMatch = heightPotentialMatch;
    }

    public double getSalaryPotentialMatch() {
        return salaryPotentialMatch;
    }

    public void setSalaryPotentialMatch(double salaryPotentialMatch) {
        this.salaryPotentialMatch = salaryPotentialMatch;
    }

}
