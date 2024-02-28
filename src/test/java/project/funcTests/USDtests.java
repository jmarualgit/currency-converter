package project.funcTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import project.Engine.Func;

public class USDtests {
    @Test
    public void convertUSDtoAUD() {
        Func func = new Func(1423.0, "USD", "AUD");

        assertTrue(2168.97 == func.calculate());
    }

    @Test
    public void convertUSDtoCAD() {
        Func func = new Func(6345.0, "USD", "CAD");

        assertTrue(8568.91 == func.calculate());
    }

    @Test
    public void convertUSDtoCNY() {
        Func func = new Func(167.0, "USD", "CNY");

        assertTrue(1201.61 == func.calculate());
    }

    @Test
    public void convertUSDtoEGP() {
        Func func = new Func(418.0, "USD", "EGP");

        assertTrue(12914.88 == func.calculate());
    }

    @Test
    public void convertUSDtoEUR() {
        Func func = new Func(648.0, "USD", "EUR");

        assertTrue(597.93 == func.calculate());
    }

    @Test
    public void convertUSDtoGBP() {
        Func func = new Func(235.0, "USD", "GBP");

        assertTrue(185.56 == func.calculate());
    }

    @Test
    public void convertUSDtoINR() {
        Func func = new Func(362.0, "USD", "INR");

        assertTrue(29995.83 == func.calculate());
    }

    @Test
    public void convertUSDtoJPY() {
        Func func = new Func(926.0, "USD", "JPY");

        assertTrue(139374.97 == func.calculate());
    }

    @Test
    public void convertUSDtoMYR() {
        Func func = new Func(427.0, "USD", "MYR");

        assertTrue(2039.29 == func.calculate());
    }

    @Test
    public void convertUSDtoPHP() {
        Func func = new Func(316.0, "USD", "PHP");

        assertTrue(17663.79 == func.calculate());
    }

    @Test
    public void convertUSDtoSGD() {
        Func func = new Func(859.0, "USD", "SGD");

        assertTrue(1153.94 == func.calculate());
    }

    @Test
    public void convertUSDtoTHB() {
        Func func = new Func(755.0, "USD", "THB");

        assertTrue(27164.18 == func.calculate());
    }
}
