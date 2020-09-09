import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        countingValleysCallange example1 = new countingValleysCallange();
        jumpingOnCloudsChallenge example2 = new jumpingOnCloudsChallenge();
        repeatedStringChallange example3 = new repeatedStringChallange();
        rotateLeft example4 = new rotateLeft();
        countingBribes example5 = new countingBribes();
        ReturnArea example6 = new ReturnArea();
        FirstNonRepeatingChar example7 = new FirstNonRepeatingChar();
        GradingStudents example8 = new GradingStudents();

        /*
         * //example1.countingValleys(8, "UDDDUDUU");
         * 
         * int[] intArray = { 0, 0, 1, 0, 1, 0 };
         * //example2.jumpingOnClouds(intArray.length, intArray);
         * 
         * Long num = new Long(10); // repeatedString = "abababababab"
         * example3.countingRepeatedCharacter("abcac", num);
         */

        int[] arr = { 1, 2, 5, 3, 7, 8, 6, 4 };

        // example5.count(arr);

        // int area = example6.shapeArea(2);
        // System.out.println(area);

        /*
         * char resultChar = example7.firstNotRepeatingCharacter(
         * "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof");
         * System.out.println(resultChar);
         */

        List<Integer> grades = new ArrayList<Integer>();

        grades.add(0);
        grades.add(38);
        grades.add(45);
        grades.add(67);
        grades.add(74);

        grades = example8.willRound(grades);

        for (int i = 0; i < grades.size(); i++) {
            System.out.println(grades.get(i));
        }
    }
}