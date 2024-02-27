package project.funcTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import project.Engine.Func;

public class USDtests {
    /* */
    @Test
    public void convertUSDtoEUR() {
        Func func = new Func(648.0, "USD", "EUR");

        assertTrue(597.93 == func.calculate());
    }

    @Test
    public void convertUSDtoCNY() {
        Func func = new Func(167.0, "USD", "CNY");

        assertTrue(1201.61 == func.calculate());
    }
}
