public class WhereInSequence {
    public NotFibonacciSequence nfs;
    public WhereInSequence(NotFibonacciSequence nfs) {
        this.nfs = nfs;
    }

    public int findPosition(int num) {
        int numTerms = 50; //generates the first 50 terms for comparison
        long[] sequence = nfs.generateNotFibonacci(numTerms);

        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == num) {
                return i + 1;
            } else if (sequence[i] > num) {
                return i;
            }
        }
        return sequence.length;
    }
}
