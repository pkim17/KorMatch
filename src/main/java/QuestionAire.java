public class QuestionAire {

    private int agePreference;
    private int heightPreference;
    private int salaryExpectation;

    public QuestionAire() {
    }

    public QuestionAire(int agePreference, int heightPreference, int salaryExpectation) {
        this.agePreference = agePreference;
        this.heightPreference = heightPreference;
        this.salaryExpectation = salaryExpectation;
    }

    public int getAgePreference() {
        return agePreference;
    }

    public void setAgePreference(int agePreference) {
        this.agePreference = agePreference;
    }

    public int getHeightPreference() {
        return heightPreference;
    }

    public void setHeightPreference(int heightPreference) {
        this.heightPreference = heightPreference;
    }

    public int getSalaryExpectation() {
        return salaryExpectation;
    }

    public void setSalaryExpectation(int salaryExpectation) {
        this.salaryExpectation = salaryExpectation;
    }
}
