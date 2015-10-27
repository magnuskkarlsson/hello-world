package se.magnuskkarlsson.example.hello;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void test() throws Exception {
        Assert.assertEquals("Hello foo", new Hello().hello("foo"));
    }
}
