package netbeans_algorithms;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberFunTest { // FindNextSquareTest
    
    @Test
    public void test1() {
        assertEquals(144, NumberFun.findNextSquare(121));
        }
    
    @Test
    public void test2() {
        assertEquals(676, NumberFun.findNextSquare(625));
    }
    
    @Test
    public void test3() {
        assertEquals(-1, NumberFun.findNextSquare(114));
    }
    
}
