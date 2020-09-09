public class countingBribes {
    
    public void count(int[] intArray) {
        int numBribes = 0;
        boolean isChaotic = false;

        for (int i = 0; i < intArray.length;i++) {
            int currentIdx = i;
            int initIdx = intArray[i] - 1;
            int displacedPosition = initIdx - currentIdx;

            if (displacedPosition > 2) {
                System.out.println("Too chaotic");
                isChaotic = true;
                break;
            }

            else if (displacedPosition > 0) {
                numBribes += displacedPosition;
            }
        }
        if(isChaotic == false) {
            System.out.println(numBribes);
        }

    }


}
