public class ReturnArea {

    public int shapeArea(int n) {
        if (n == 1) {
            return 1;
        }
        int product = 2 * (n - 1);
        return (n * product) + 1;
    }
}