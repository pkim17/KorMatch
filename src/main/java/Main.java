import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
//        Creates an ArrayList with Profile objects
        List<Profile> femaleList = new ArrayList<>(Arrays.asList(
            new Profile("Emma", 24, 169, "New York", "Student", 0, 0),
            new Profile("Scarlet", 30, 160, "New York", "Entrepreneur", 150000, 0),
            new Profile("Annie", 27, 150, "San Francisco", "Software Engineer", 300000, 0)
        ));
//      List<Profile> maleList = new ArrayList<>(Arrays.asList(
//        Profile maleOne = new Profile("Jaewoo", 31, 175, "San Francisco", "CEO", 5000000, 0);
//        Profile maleTwo = new Profile("Peter", 30, 173, "Atlanta", "CTO", 1000000, 0);
//        Profile maleThree = new Profile("David", 30, 173, "New York", "Data Scientist", 2000000, 0);
//      ));

        MatchScorer matchScorer = new MatchScorer();
        matchScorer.assignPreference(24, 170, 150000);
        matchScorer.calculateIndividualPoints(femaleList);
        matchScorer.printPoints(femaleList);

        System.out.println("\nAfter new profile addition: ");
        femaleList.add(new Profile("Cindy", 32, 165, "San Francisco", "Product Owner", 200000, 0));
        matchScorer.calculateIndividualPoints(femaleList);
        matchScorer.printPoints(femaleList);

    }
}
