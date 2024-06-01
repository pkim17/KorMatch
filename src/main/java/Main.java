import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {

//        Profile maleOne = new Profile("Jaewoo", 31, 175, "San Francisco", "CEO", 5000000, 0);
//        Profile maleTwo = new Profile("Peter", 30, 173, "Atlanta", "CTO", 1000000, 0);
//        Profile maleThree = new Profile("David", 30, 173, "New York", "Data Scientist", 2000000, 0);
        Profile femaleOne = new Profile("Emma", 24, 169, "New York", "Student", 1, 0);
        Profile femaleTwo = new Profile("Scarlet", 30, 160, "New York", "Entrepreneur", 150000, 0);
        Profile femaleThree = new Profile("Annie", 27, 140, "San Francisco", "Software Engineer", 300000, 0);

//        List<Profile> maleList = new ArrayList<>();
        List<Profile> femaleList = new ArrayList<>();
//        maleList.add(maleOne);
//        maleList.add(maleTwo);
//        maleList.add(maleThree);
        femaleList.add(femaleOne);
        femaleList.add(femaleTwo);
        femaleList.add(femaleThree);

        MatchScorer matchScorer = new MatchScorer();
        matchScorer.assignPreference(24, 169, 150000);
        matchScorer.calculateIndividualPoints(femaleList);
        matchScorer.printPoints(femaleList);

    }
}
