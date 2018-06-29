/*
Get the Mean of an Array

8kyu

It's the academic year's end, fateful moment of your school report. The averages must be calculated. All the students come to you and entreat you to calculate their average for them. Easy ! You just need to write a script.

Return the average of the given array rounded down to its nearest integer.

The array will never be empty.
*/

///// TESTING /////

public class School {

  public static int getAverage(int[] marks) {
    int total = 0;
    int count = 0;
    for (int number : marks) {
      total += marks[number];
      count++;
    }
    return total / count;
  }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
  	@Test
	public void simpleTest() {
		assertEquals(2,School.getAverage(new int[] {2,2,2,2}));
		assertEquals(3,School.getAverage(new int[] {1,2,3,4,5}));
		assertEquals(1,School.getAverage(new int[] {1,1,1,1,1,1,1,2}));
	}
}
