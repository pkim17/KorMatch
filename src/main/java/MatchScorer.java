import java.util.List;

import static java.lang.Math.abs;
import static java.lang.Math.log10;

public class MatchScorer {

    QuestionAire questionAire = new QuestionAire();
    Point point = new Point();

    // Define maximum difference value for data normalization
    int maxAgeDiff = 20; // Max age difference from the agePreference
    int maxHeightDiff = 30; // Max height difference from heightPreference
    double maxSalaryDiff = 200000; // Max salary difference from salaryExpectation

    int ageDiff;
    int heightDiff;
    double salaryDiff;

    public void assignPreference(int agePreference, int heightPreference, int salaryExpectation) {
        questionAire.setAgePreference(agePreference);
        questionAire.setHeightPreference(heightPreference);
        questionAire.setSalaryExpectation(salaryExpectation);
    }

    public void calculateIndividualPoints(List<Profile> profileList) {

        for (Profile profile : profileList) {

            ageDiff = abs(questionAire.getAgePreference() - profile.getAge());
            heightDiff = abs(questionAire.getHeightPreference() - profile.getHeight());
            salaryDiff = abs(questionAire.getSalaryExpectation() - profile.getSalary());

            point.setAgePotentialMatch(1 - ((double)ageDiff / (double)maxAgeDiff));
            point.setHeightPotentialMatch(1 - ((double)heightDiff / (double)maxHeightDiff));
            point.setSalaryPotentialMatch(1 - (salaryDiff / maxSalaryDiff));

            profile.setTotalMatchPoint((point.getAgePotentialMatch() + point.getHeightPotentialMatch() + point.getSalaryPotentialMatch()) / 3 * 100);
        }
//        for (Profile profile : profileList ) {
////            Calculation is flawed
//            point.setAgePotentialMatch(1.0 - (log10((abs(profile.getAge() - questionAire.getAgePreference())) + 1) / (log10(Math.max(profile.getAge(), questionAire.getAgePreference()) + 1))));
//            point.setHeightPotentialMatch(1.0 - (log10((abs(profile.getHeight() - questionAire.getHeightPreference())) + 1) / (log10(Math.max(profile.getHeight(), questionAire.getHeightPreference()) + 1))));
//            point.setSalaryPotentialMatch(1.0 - (log10((abs(profile.getSalary() - questionAire.getSalaryExpectation())) + 1) / (log10(Math.max(profile.getSalary(), questionAire.getSalaryExpectation()) + 1))));
    }



    public void printPoints(List<Profile> profileList) {
        for (Profile profile : profileList) {
            System.out.println(profile.getName() + "'s Compatability: " + String.format("%.2f", profile.getTotalMatchPoint()) + "%");
        }
    }

}
