package cpsc;

public class Main {

    public static void GibbsSampling() {
        // Initialize probabilities, but only where B = b1
        float a0b1 = 5f;
        float a1b1 = 10f;
        float b1c0 = 1f;
        float b1c1 = 100f;
        float c0d0 = 1f;
        float c0d1 = 100f;
        float c1d0 = 100f;
        float c1d1 = 1f;
        float d0a0 = 100f;
        float d0a1 = 1f;
        float d1a0 = 1f;
        float d1a1 = 100f;

        float a0b1c0d0 = a0b1 * b1c0 * c0d0 * d0a0;
        float a0b1c0d1 = a0b1 * b1c0 * c0d1 * d1a1;
        float a0b1c1d0 = a0b1 * b1c1 * c1d0 * d0a0;
        float a0b1c1d1 = a0b1 * b1c1 * c1d1 * d1a0;
        float a1b1c0d0 = a1b1 * b1c0 * c0d0 * d0a1;
        float a1b1c0d1 = a1b1 * b1c0 * c0d1 * d1a1;
        float a1b1c1d0 = a1b1 * b1c1 * c1d0 * d0a1;
        float a1b1c1d1 = a1b1 * b1c1 * c1d1 * d1a1;

        // Normalize probabilities
        float sum = a0b1c0d0 + a0b1c0d1 + a0b1c1d0 + a0b1c1d1 + a1b1c0d0
                + a1b1c0d1 + a1b1c1d0 + a1b1c1d1;

        float normalize_a0b1c0d0 = a0b1c0d0 / sum;
        float normalize_a0b1c0d1 = a0b1c0d1 / sum;
        float normalize_a0b1c1d0 = a0b1c1d0 / sum;
        float normalize_a0b1c1d1 = a0b1c1d1 / sum;
        float normalize_a1b1c0d0 = a1b1c0d0 / sum;
        float normalize_a1b1c0d1 = a1b1c0d1 / sum;
        float normalize_a1b1c1d0 = a1b1c1d0 / sum;
        float normalize_a1b1c1d1 = a1b1c1d1 / sum;

        // We will resample non-evidence variables using a random order
        

        // Frequency of seeing a1

    }

    public static void main(String[] args) {
        GibbsSampling();
    }
}
