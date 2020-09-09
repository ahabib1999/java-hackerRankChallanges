import java.util.HashMap;

public class FirstNonRepeatingChar {

    public char firstNotRepeatingCharacter(String s) {

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (charMap.containsKey(currentChar)) {
                int numOccurence = charMap.get(currentChar);
                numOccurence++;
                charMap.put(currentChar, numOccurence);
            }

            else {
                charMap.put(currentChar, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int numOccurence = charMap.get(currentChar);

            if (numOccurence == 1) {
                return currentChar;
            }
        }
        return '_';
    }
}