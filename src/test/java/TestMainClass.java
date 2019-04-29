import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMainClass {

    @Test
    public void test1() {
        int[] arr = {1,2,3,10,100};
        assertTrue(Main.isSumInArr( arr,102));
    }




}

