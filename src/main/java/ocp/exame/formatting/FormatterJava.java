package ocp.exame.formatting;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class FormatterJava {
    public static void main(String[] args) {
        String amount =  "11,55";
        DecimalFormat decimalFormat = new DecimalFormat();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator( ',' );

        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        decimalFormat.setCurrency(Currency.getInstance(Locale.FRANCE));
        decimalFormat.setGroupingUsed(false);
        decimalFormat.setMaximumFractionDigits(2);

        Number formattedNumber;
        try {
            formattedNumber = decimalFormat.parse(amount);
        } catch (ParseException e) {
            System.out.println("ERROR : " + e.getMessage());

            throw new RuntimeException(e);
        }


        System.out.println("amount Formatted = " + formattedNumber);
        System.out.println("amount = " + amount);
    }
}
