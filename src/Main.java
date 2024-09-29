public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String par) {
            int balance=0;
            int len=par.length();
            for(int i=0;i<len;i++)
            {
                String current=par.substring(i,i+1);
                if("(".equals(current))
                {
                    balance++;
                }
                else if(")".equals(current))
                {
                    balance--;
                }
                if(balance<0) return false;
            }
            return true;
    }

    // 2. reverseInteger
    public static String reverseInteger(int dig) {
            String numStr=Integer.toString(dig);
            StringBuilder reversed=new StringBuilder(numStr).reverse();
            return reversed.toString();
    }

    // 3. encryptThis
    public static String encryptThis(String message) {
        String[] words = message.split(" ");
        StringBuilder encryptedMessage = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                int firstCharCode = (int) word.charAt(0);
                char secondChar = word.charAt(1);
                char lastChar = word.charAt(word.length() - 1);

                StringBuilder encryptedWord = new StringBuilder();
                encryptedWord.append(firstCharCode);
                encryptedWord.append(lastChar);
                encryptedWord.append(word, 2, word.length() - 1);
                encryptedWord.append(secondChar);
                encryptedMessage.append(encryptedWord).append(" ");
            }
            else
            {
                encryptedMessage.append((int) word.charAt(0)).append(" ");
            }
        }
        if (encryptedMessage.length() > 0) {
            encryptedMessage.setLength(encryptedMessage.length() - 1);
        }
        return encryptedMessage.toString();
    }

    // 4. decipherThis
    public static String decipherThis(String message)
    {
        String[] words = message.split(" ");
        StringBuilder decipheredMessage = new StringBuilder();

        for (String word : words) {
            // Extract the character code of the first letter
            int spaceIndex = word.indexOf(' ');
            int firstCharCode = Integer.parseInt(word.substring(0, spaceIndex));
            char firstChar = (char) firstCharCode;

            // Extract the rest of the word
            String restOfWord = word.substring(spaceIndex + 1);

            if (restOfWord.length() > 1) {
                // Switch the second and the last letter
                char secondChar = restOfWord.charAt(0);
                char lastChar = restOfWord.charAt(restOfWord.length() - 1);
                String middlePart = restOfWord.substring(1, restOfWord.length() - 1);

                // Build the deciphered word
                String decipheredWord = firstChar + lastChar + middlePart + secondChar;
                decipheredMessage.append(decipheredWord).append(" ");
            }
            else {
                decipheredMessage.append(firstChar).append(restOfWord).append(" ");
            }
        }
        if (decipheredMessage.length() > 0) {
            decipheredMessage.setLength(decipheredMessage.length() - 1);
        }
        return decipheredMessage.toString();
    }
    }
