package counter;

/**
 * WordProcessor implementation of the {@link Counter} interface.
 *
 * Complete this class in Step 2 and Step 3 on your feature branches.
 */
public class WordProcessor implements Counter {

    // =========================================================================
    // STEP 3: Encapsulated Fallback State
    // =========================================================================

    // Private text attribute
    private String text = "";

    // Getter for text
    public String getText() {
        return text;
    }

    // Setter for text
    public void setText(String text) {
        this.text = text;
    }

    // =========================================================================
    // STEP 2: Core Sentence Analysis Methods
    // =========================================================================

    /**
     * Counts the number of words in the given sentence.
     *
     * @param sentence input string to analyze
     * @return number of words
     */
    @Override
    public int countWords(String sentence) {
        if (sentence.isEmpty()) {
            return 0;
        }

        return sentence.split(" ").length;
    }

    /**
     * Counts alphabetic letters only, ignoring spaces, punctuation, and digits.
     *
     * @param sentence input string to analyze
     * @return count of alphabetic letters
     */
    @Override
    public int countLetters(String sentence) {
        int letters = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            }
        }

        return letters;
    }

    /**
     * Returns the total character length of the sentence, including spaces.
     *
     * @param sentence input string to analyze
     * @return total length
     */
    @Override
    public int getLength(String sentence) {
        return sentence.length();
    }
}