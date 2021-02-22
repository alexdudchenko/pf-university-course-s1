package com.company;

public class RowPrinter implements Printer{
    @Override
    public void print(byte[] array) {
        for(byte i: array) {
            System.out.print(i + " ");
        }
    }
}
