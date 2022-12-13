package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip<0||lastInRow<0){
            System.out.println("last number in row is negative");

        }else if (numberToSkip>lastInRow){
            System.out.println("number to skip is bugger then the last");
        }else {
            int sum1=0;
            int sum2=0;
            for (int i = 0; i <= numberToSkip; i++) {
                sum1+=i;
            }
            for (int i = numberToSkip+1; i <= lastInRow; i++) {
                sum2+=i;
            }
            System.out.print("skipped sum is "+sum1+"\ncounted sum is "+sum2+"\n");
        }
    }
}
