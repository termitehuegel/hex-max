package de.philipberner.bwinf.runde2.aufgabe3;

import de.philipberner.bwinf.runde2.aufgabe3.sevenSegmentDisplay.SevenSegmentDisplay;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HexMax max = new HexMax(4, new HexNumber("D1D"));
        HexNumber num = max.maxHexNumber();
        System.out.println(num.getHex());
    }
}
