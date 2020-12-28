import java.lang.Math;
import java.util.List;

public class AbslouteDifference {

    public int getDifference(List<List<Integer>> arr) {
        int leftToRightSum = 0;
        int rightToLeftSum = 0;
        int i = 0;
        int j = 0;

        while (i < arr.size() && j < arr.get(i).size()) {

            leftToRightSum += arr.get(i).get(j);
            i = i + 1;
            j = j + 1;
        }

        i = 0;
        j = arr.size() - 1;

        while (i < arr.size() && j >= 0) {
            rightToLeftSum += arr.get(i).get(j);
            i = i + 1;
            j = j - 1;
        }

        return Math.abs(leftToRightSum - rightToLeftSum);
    }
}
