package console;

import model.tax.Tax;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        TreeSet<Tax> tasx = new TaxReader().read();
        for (Tax t : tasx) {
            System.out.println(t + ", final tax = " + String.format("%.3g", t.getTax()));
        }
    }
}
