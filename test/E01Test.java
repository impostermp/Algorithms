package test;
import org.junit.jupiter.api.Test;

import src.E01;

import static org.junit.jupiter.api.Assertions.*;

public class E01Test {

    
    @Test
    public void sumThree(){
        E01 algo = new E01();
        
        int testVal = algo.sum(3);

        assertEquals(6,testVal);
    }

    @Test
    public void sumSix(){
        E01 algo = new E01();
        
        int testVal = algo.sum(6);

        assertEquals(21,testVal);
    }

    @Test
    public void sumSquaresEven(){
        E01 algo = new E01();
        
        int testVal = algo.sumSquares(4);

        assertEquals(20,testVal);
    }

    @Test
    public void sumSquaresSix(){
        E01 algo = new E01();
        
        int testVal = algo.sumSquares(6);

        assertEquals(56,testVal);
    }
    @Test
    public void sumSquaresOdd(){
        E01 algo = new E01();
        
        int testVal = algo.sumSquares(3);

        assertEquals(4,testVal);
    }
    @Test
    public void fib(){
        E01 algo = new E01();
        
        int testVal = algo.fib(8);

        assertEquals(21,testVal);
    }

    @Test
    public void linear(){
        E01 algo = new E01();
        
        boolean testVal = algo.linear("aword", 'w',5);

        assertEquals(true,testVal);
    }
    @Test
    public void binarySearch(){
        E01 algo = new E01();
        int[] myArr = {1,3,5,9};
        boolean testVal = algo.binarySearch(myArr, 5);

        assertEquals(true,testVal);
    }

    @Test
    public void binarySearchFalse(){
        E01 algo = new E01();
        int[] myArr = {1,3,5,9};
        boolean testVal = algo.binarySearch(myArr, 2);

        assertNotEquals(true,testVal);
    }
}