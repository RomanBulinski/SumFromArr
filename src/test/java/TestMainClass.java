import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMainClass {

    @Test
    public void test1() {
        int[] arr = {1,2,3,10,100};
        assertTrue(Main.isSumInArr( arr,102));
    }

    @Test
    public void test2() {
        int[] arr = {1000,1,2,3,10,100};
        assertTrue(Main.isSumInArr( arr,1003));
    }

    @Test
    public void test3() {
        int[] arr = {10,1,2,3,10,10};
        assertTrue(Main.isSumInArr( arr,20));
    }

    @Test
    public void test4() {
        int[] arr = {10,1,2,3,10};
        assertTrue(Main.isSumInArr( arr,20));
    }

    @Test
    public void test5() {
        int[] arr = {10,1,2,3,4};
        assertFalse(Main.isSumInArr( arr,20));
    }

    @Test
    public void test6() {
        int[] arr = {10,1,2,3};
        assertFalse(Main.isSumInArr( arr,0));
    }

    @Test
    public void test7() {
        int[] arr = {10,1,2,3};
        assertFalse(Main.isSumInArr( arr,50));
    }

}

