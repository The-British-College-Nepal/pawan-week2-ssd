
package counter;

/**
 * WordProcessor implementation of the {@link Counter} interface.
 */
public class WordProcessor implements Counter {

    // Encapsulated fallback state
    private String text = "";

    // Getter
    public String getText() {
        return this.text;
    }

    // Setter
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Counts the number of words in the given sentence.
     */
    @Override
    public int countWords(String sentence) {

        if (sentence == null) {
            sentence = this.text;
        }

        if (sentence.isEmpty()) {
            return 0;
        }

        return sentence.split(" ").length;
    }

    /**
     * Counts alphabetic letters only.
     */
    @Override
    public int countLetters(String sentence) {

        if (sentence == null) {
            sentence = this.text;
        }

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
     * Returns the total character length, including spaces.
     */
    @Override
    public int getLength(String sentence) {

        if (sentence == null) {
            sentence = this.text;
        }

        return sentence.length();
    }
}
