package Engine;

public class Func {
    private Double answer;

    private Double inputAmt;
    private String initialCurr;
    private String resultingCurr;

    private String[] currencyNames = {
        "USD", "EUR", "GBP", "INR", "AUD", "CAD", "SGD", "CHF"
    };

    // from https://www.xe.com/currencytables/?from=USD&date=2024-02-25#table-section
    // as per Feb 25, 2024, 17:00 UTC
    private Double[] currencyConversionRates = {
        1.0,                        // USD
        0.9227329074620213,         // EUR
        0.7895958240672866,         // GBP
        82.86140364851931,          // INR
        1.5242213075073965,         // AUD
        1.3504983975127547,         // CAD
        1.3433559449788466,         // SGD
        0.8811734628276657,         // CHF
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

        System.out.printf("calculated to be %s\n", roundedAns);

        return roundedAns;
    }
}
