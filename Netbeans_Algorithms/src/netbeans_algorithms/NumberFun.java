package netbeans_algorithms;

/*
3rd Alogrithm
Find the Next Perfect Square!
7kyu

You might know some pretty large perfect squares. But what about the NEXT one?

Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.

If the parameter is itself not a perfect square, than -1 should be returned. You may assume the parameter is positive.
*/

public class NumberFun {
    public static long findNextSquare(long sq) {
        if (Math.sqrt(sq) == Math.floor(Math.sqrt(sq))) {
            double baseNumber = Math.sqrt(sq);
            return (long)Math.pow(baseNumber + 1, 2);
        }
        return -1;
    }
}
