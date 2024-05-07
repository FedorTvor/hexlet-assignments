package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {

    private final String originalSequence;

    public ReversedSequence(String originalSequence) {
        this.originalSequence = originalSequence;
    }

    public int length() {
        return originalSequence.length();
    }


    public char charAt(int index) {
        return originalSequence.charAt(length() - 1 - index);
    }

    public CharSequence subSequence(int start, int end) {
        return new ReversedSequence(originalSequence.substring(length() - end, length() - start));
    }
    public String toString() {
        return new StringBuilder(originalSequence).reverse().toString();
    }
}
// END
