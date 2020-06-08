public class jumpingOnCloudsChallenge {

    public void jumpingOnClouds(int n, int[] intArray) {
        // intArray = {0, 1, 0, 0, 1, 0, 0}

        int numSteps = 0;

        for (int i = 0; i < n;) {

            if (i < (n - 2) && intArray[i + 2] == intArray[i]) {
                i = i + 2;
                numSteps += 1;
            }

            else if (i < (n - 1) && intArray[i + 1] == intArray[i]) {
                i = i + 1;
                numSteps += 1;
            } else {
                i++;
            }
        }
        System.out.println(numSteps);

    }
}