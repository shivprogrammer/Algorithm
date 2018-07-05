package netbeans_algorithms;

import org.junit.Test;
import static org.junit.Assert.*;

public class AbbreviateTwoWordsTest {
        
    @Test
        public void testFixed() {
        assertEquals(AbbreviateTwoWords.abbrevName("Sam Harris"), "S.H");
        assertEquals(AbbreviateTwoWords.abbrevName("Patrick Feenan"), "P.F");
        assertEquals(AbbreviateTwoWords.abbrevName("Evan Cole"), "E.C");
        assertEquals(AbbreviateTwoWords.abbrevName("P Favuzzi"), "P.F");
        assertEquals(AbbreviateTwoWords.abbrevName("David Mendieta"), "D.M");
    }
}