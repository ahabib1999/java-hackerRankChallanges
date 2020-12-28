public class SimpleCipher {

    public void simpleCipher(String encrypted, int k) {

        StringBuilder resultStr = new StringBuilder();

        if (k > 26) {
            k = k / 26;
        }

        for (int j = 0; j < encrypted.length(); j++) {

            char currentChar = encrypted.charAt(j);
            int position = currentChar - k;

            if (position < 65) {
                int intVal = 91 - (65 - position);

                char newChar = (char) intVal;
                resultStr.append(newChar);
            }

            else {
                char decryptedChar = (char) position;
                resultStr.append(decryptedChar);
            }
        }

        String resStr = resultStr.toString();

        for (int i = 0; i < resStr.length(); i++) {
            System.out.println(resStr.charAt(i));
        }
    }
}
