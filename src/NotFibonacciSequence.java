public class NotFibonacciSequence {
    public long[] generateNotFibonacci(int numTerms) {
        long[] sequence = new long[numTerms];
        //Initialize the first 2 terms: 0 & 1
        sequence[0] = 0;
        if (numTerms > 1) {
            sequence[1] = 1;
        }

        for(int i = 2; i < numTerms; i++) {
            sequence[i] = (3 * sequence[i - 1]) + (2 * sequence[i - 2]);
        }

        if (numTerms <= 0) {
            System.out.println("Please enter a positive number :)");
            return new long[0]; //empty array
        }
        return sequence;
    }
}
