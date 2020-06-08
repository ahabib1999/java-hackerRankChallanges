public class Main {
    
    public static void main(String[] args) {
        countingValleysCallange example1 = new countingValleysCallange();
        jumpingOnCloudsChallenge example2 = new jumpingOnCloudsChallenge();
        repeatedStringChallange example3 = new repeatedStringChallange();

        //example1.countingValleys(8, "UDDDUDUU");

        int[] intArray = { 0, 0, 1, 0, 1, 0 };
        //example2.jumpingOnClouds(intArray.length, intArray);

        Long num = new Long(10);
        // repeatedString = "abababababab"
        example3.countingRepeatedCharacter("abcac", num);
    }
}