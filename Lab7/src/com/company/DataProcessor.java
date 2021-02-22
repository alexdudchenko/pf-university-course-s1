package com.company;

public class DataProcessor {
    private Sorter sorter;
    private Printer printer;

    public DataProcessor(Sorter sorter, Printer printer) {
        this.sorter = sorter;
        this.printer = printer;
    }

    public void process(byte[] array) {
        sorter.sort(array);
        printer.print(array);
    }
}
