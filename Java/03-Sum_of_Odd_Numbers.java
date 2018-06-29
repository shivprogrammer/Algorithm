/*
Sum of Odd Numbers

7kyu

Given the triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...

// 2 6 12 20
Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:

rowSumOddNumbers(1); // 1
rowSumOddNumbers(2); // 3 + 5 = 8
*/

class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
      int countDown = n;
      int startingPoint = 0;
      int total = 0;

      while (countDown > 0) {
        if (countDown == n) {
          startingPoint += 1;
          countDown--;
        }
        else {
          
        }
      }
    }
}

///// TESTING //////

import static org.junit.Assert.*;
import org.junit.Test;

public class RowSumOddNumbersTest {

    @Test
    public void test1() {
        assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
    }
}
