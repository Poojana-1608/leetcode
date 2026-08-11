// Last updated: 8/11/2026, 11:33:48 AM
public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        String[] charToWord = new String[26]; // mapping from char (a-z) to word
        String[] usedWords = new String[words.length]; // list of already used words

        for (int i = 0; i < pattern.length(); i++) {
            int index = pattern.charAt(i) - 'a';
            String word = words[i];

            if (charToWord[index] == null) {
                // Check if this word is already used for another character
                for (String used : charToWord) {
                    if (word.equals(used)) {
                        return false; // word already mapped to another character
                    }
                }
                charToWord[index] = word; // create new mapping
            } else {
                if (!charToWord[index].equals(word)) {
                    return false; // mismatch in mapping
                }
            }
        }

        return true;
    }
}