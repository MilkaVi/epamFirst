package console;

import model.tax.Tax;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Tax> tasx = new TaxReader().read();
        for (Tax t : tasx) {
            System.out.println(t + ", final tax = " + t.getTax());
        }
    }
}
