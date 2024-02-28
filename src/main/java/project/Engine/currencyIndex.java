package project.Engine;

public class currencyIndex {
    private static String[][] currencyNames = {
        {"USD", "US Dollar"}, {"AUD", "Australian Dollar"},
        {"CAD", "Canadian Dollar"}, {"CHF", "Swiss Franc"},
        {"CNY", "Chinese Yuan Renminbi"}, {"EGP", "Egyptian Pound"},
        {"EUR", "Euro"}, {"GBP", "British Pound"},
        {"INR", "Indian Rupee"}, {"JPY", "Japanese Yen"},
        {"MYR", "Malaysian Ringgit"}, {"PHP", "Philippine Peso"}, 
        {"SGD", "Singapore Dollar"}, {"THB", "Thai Baht"}
    };

    // from https://www.xe.com/currencytables/?from=USD&date=2024-02-25#table-section
    // as per Feb 25, 2024, 17:00 UTC
    // FROM USD
    private static Double[] currencyConversionRates = {
        1.0,                        // USD
        1.5242213075073965,         // AUD
        1.3504983975127547,         // CAD
        0.8811734628276657,         // CHF
        7.19525427640289,           // CNY
        30.896834770188953,         // EGP
        0.9227329074620213,         // EUR
        0.7895958240672866,         // GBP
        82.86140364851931,          // INR
        150.51292150487106,         // JPY
        4.775853402380541,          // MYR
        55.89806446352491,          // PHP
        1.3433559449788466,         // SGD
        35.979050064956745,         // THB
    };

    public currencyIndex() {

    }

    public static String getFullCurrencyName(String currencyAbbreviation) {
        String fullName = "";

        for (int i = 0; i < currencyNames.length; i++) {
            if (currencyNames[i][0] == currencyAbbreviation) {
                fullName = currencyNames[i][1];
            }
        }

        return fullName;
    }

    public static double getConversionRate(String inputName, String resultingName) {
        double conversionRate = 0;
        
        if (inputName != "USD") {
            // find conversion from input to USD
            double conversionFromInputToUSD = 0;
            double conversionFromUSDtoResult = 0;
            int j = 0;
        
            for (int i = 0; i < currencyNames.length; i++) {
                if (currencyNames[i][0] == inputName) {
                    j = i;
                }
            }

            conversionFromInputToUSD = currencyConversionRates[j];

            // find conversion from USD to output
            j = 0;
        
            for (int i = 0; i < currencyNames.length; i++) {
                if (currencyNames[i][0] == resultingName) {
                    j = i;
                }
            }

            conversionFromUSDtoResult = currencyConversionRates[j];

            conversionRate = (1.0 / conversionFromInputToUSD) * conversionFromUSDtoResult;

        } else {
            int j = 0;
        
            for (int i = 0; i < currencyNames.length; i++) {
                if (currencyNames[i][0] == resultingName) {
                    j = i;
                }
            }
    
            conversionRate = currencyConversionRates[j];
        }
        
        return conversionRate;
    }
}
