package project.Engine;

public class Func {
    private Double answer;

    private Double inputAmt;
    private String initialCurr;
    private String resultingCurr;

    private void printSubmission() {
        System.out.println("Submitted new!\nInitial Currency: " + this.initialCurr + " with a value of " + this.inputAmt + ", Resulting Currency: " + this.resultingCurr);
    }
    
    public Func(Double inputCurrencyAmt, String intialCurrency, String resultingCurrency) {
        this.inputAmt = inputCurrencyAmt;
        this.initialCurr = intialCurrency;
        this.resultingCurr = resultingCurrency;

        printSubmission();
    }

    public double calculate() {
        answer = inputAmt * currencyIndex.getConversionRate(this.initialCurr, this.resultingCurr);

        double roundedAns = Math.round(answer * 100.0) / 100.0;

        System.out.printf("calculated to be %s\n", roundedAns);

        return roundedAns;
    }
}
