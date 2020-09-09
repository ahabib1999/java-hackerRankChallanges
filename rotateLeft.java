public class rotateLeft {
    
    public void rotate(int[] arr, int d) {
        // numList = {5, 4, 3, 2} d = 2
        // 1st iteration: {4, 3, 2, 5}
        // desired = {3, 2, 5, 4}

        int temp;

        for (int i = 0;i < d;i++) {

            temp = arr[0];

            for (int j = 1; j < arr.length ;j++) {
                arr[j - 1] = arr[j];
            }
            arr[arr.length - 1] = temp;
        }

            for (int i = 0;i < arr.length;i++) {
                System.out.println(arr[i]);
            } 
    }
}