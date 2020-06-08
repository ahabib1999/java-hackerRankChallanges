public class repeatedStringChallange {
    
    public void countingRepeatedCharacter(String s, Long n) {

        int repeatCount = 0;
        int numOfChars = n.intValue();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                repeatCount += 1; 
            }
        }

        long output = (numOfChars / s.length()) * repeatCount;

        int remainder = numOfChars % s.length();

        for (int i = 0; i < remainder; i++) {
            if (s.charAt(remainder) == 'a') {
                output += 1;
            }
        }
        System.out.println(output);
    }
}