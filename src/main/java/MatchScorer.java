import java.util.List;

import static java.lang.Math.abs;
import static java.lang.Math.log10;

public class MatchScorer {

    QuestionAire questionAire = new QuestionAire();
    Point point = new Point();



    public void assignPreference(int agePreference, int heightPreference, int salaryExpectation) {
        questionAire.setAgePreference(agePreference);
        questionAire.setHeightPreference(heightPreference);
        questionAire.setSalaryExpectation(salaryExpectation);
    }

    public void calculateIndividualPoints(List<Profile> profileList) {

        for (Profile profile : profileList ) {
//            Calculation is flawed
            point.setAgePotentialMatch(1.0 - (log10((abs(profile.getAge() - questionAire.getAgePreference())) + 1) / (log10(Math.max(profile.getAge(), questionAire.getAgePreference()) + 1))));
            point.setHeightPotentialMatch(1.0 - (log10((abs(profile.getHeight() - questionAire.getHeightPreference())) + 1) / (log10(Math.max(profile.getHeight(), questionAire.getHeightPreference()) + 1))));
            point.setSalaryPotentialMatch(1.0 - (log10((abs(profile.getSalary() - questionAire.getSalaryExpectation())) + 1) / (log10(Math.max(profile.getSalary(), questionAire.getSalaryExpectation()) + 1))));
            profile.setTotalMatchPoint((point.getAgePotentialMatch() + point.getHeightPotentialMatch() + point.getSalaryPotentialMatch()) / 3);
        }

    }
    public void printPoints(List<Profile> profileList) {
        for (Profile profile : profileList) {
            System.out.println(profile.getName() + " Compatability: " + String.format("%.2f", (profile.getTotalMatchPoint() * 100)) + "%");
        }
    }

}
