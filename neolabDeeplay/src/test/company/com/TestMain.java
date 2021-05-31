package test.company.com;

import main.company.com.Main;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestMain {

    @Test
    public void test1() {
        Main main = new Main();
        List<Integer> result = List.of(8,64);

        Assert.assertEquals(result, main.getResult("iiisdoso"));
    }

    @Test
    public void test2() {
        Main main = new Main();
        List<Integer> result = List.of(8,64);

        Assert.assertNotEquals(result, main.getResult("iiisdosoio"));
    }
}
