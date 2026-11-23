package counter;

/**
 * Defines the contract for sentence analysis operations.
 */
public interface Counter {

    /**
     * Counts the number of words in the given sentence.
     *
     * @param sentence the input string to analyze
     * @return the number of words
     */
    int countWords(String sentence);

    /**
     * Counts the alphabetic letters in the sentence.
     *
     * @param sentence the input string to analyze
     * @return the number of alphabetic letters
     */
    int countLetters(String sentence);

    /**
     * Calculates the total character length, including spaces.
     *
     * @param sentence the input string to analyze
     * @return the total number of characters
     */
    int getLength(String sentence);
}