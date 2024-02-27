package Engine;

public class Func {
    private Double answer;

    private Double inputAmt;
    private String initialCurr;
    private String resultingCurr;

    private String[] currencyNames = {
        "USD", "EUR", "GBP", "INR"
    };

    private Double[] currencyConversionRates = {
        1.0, 0.9227329074620213, 0.7895958240672866, 82.86140364851931
    };

    private void printSubmission() {
        System.out.println("Submitted new!\nInitial Currency: " + this.initialCurr + " with a value of " + this.inputAmt + ", Resulting Currency: " + this.resultingCurr);
    }
    
    public Func(Double inputCurrencyAmt, String intialCurrency, String resultingCurrency) {
        this.inputAmt = inputCurrencyAmt;
        this.initialCurr = intialCurrency;
        this.resultingCurr = resultingCurrency;

        printSubmission();
    }

    private double getConversionRate(String name) {
        int j = 0;
        
        for (int i = 0; i < currencyNames.length; i++) {
            if (currencyNames[i] == name) {
                j = i;
            }
        }

        return currencyConversionRates[j];
    }

    public double calculate() {
        answer = inputAmt * getConversionRate(this.resultingCurr);

        double roundedAns = Math.round(answer * 100.0) / 100.0;

        System.out.printf("calculated to be %s", roundedAns);

        return roundedAns;
    }
}
