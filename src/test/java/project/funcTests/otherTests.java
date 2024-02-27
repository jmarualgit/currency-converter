package project.funcTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import project.Engine.Func;

public class otherTests {
    @Test
    public void convertJPYtoPHP() {
        Func func = new Func(523.0, "JPY", "PHP");

        assertTrue(194.23 == func.calculate());
    }

    @Test
    public void convertPHPtoJPY() {
        Func func = new Func(984.0, "PHP", "JPY");

        assertTrue(2649.55 == func.calculate());
    }
}
