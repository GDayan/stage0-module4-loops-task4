package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger than the last");
            return;
        }

        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }

        int skippedSum = calculateSumSkipping(numberToSkip, lastInRow);
        int countedSum = calculateSumCounting(numberToSkip, lastInRow);

        System.out.println("skipped sum is " + skippedSum);
        System.out.println("counted sum is " + countedSum);
    }

    private int calculateSumSkipping(int numberToSkip, int lastInRow) {
        int sum = 0;
        for (int i = 1; i <= lastInRow; i++) {
            if (i % numberToSkip != 0) {
                sum += i;
            }
        }
        return sum;
    }

    private int calculateSumCounting(int numberToSkip, int lastInRow) {
        int sum = 0;
        for (int i = 1; i <= lastInRow; i++) {
            sum += i;
        }
        return sum;
    }
}
