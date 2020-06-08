public class countingValleysCallange {
    // s = {UDDDUDUU} // elev = 0 // valleyCount = 0 // char = U
    public void countingValleys(int n, String s) {
        int valleyCount = 0;
        int elevation = 0;
        
        for (int i = 0; i < n;i ++) {
            char currentChar = s.charAt(i);

            if (currentChar == 'D') {
                elevation --;
            }

            else {
                elevation ++;
            }

            if (elevation == 0 && currentChar == 'U') {
            valleyCount += 1;
            } 
        }
        System.out.println(valleyCount);
    }

}