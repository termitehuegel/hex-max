package de.philipberner.bwinf.runde2.aufgabe3;

import de.philipberner.bwinf.runde2.aufgabe3.sevenSegmentDisplay.SevenSegmentDisplay;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SevenSegmentDisplay siebenSegmentAnzeige = new SevenSegmentDisplay();
        siebenSegmentAnzeige.generateChangeList();
        System.out.println(Arrays.deepToString(siebenSegmentAnzeige.possibleMoves()));

        HexMax max = new HexMax(12, new HexNumber("D1D1D1"));
        HexNumber num = max.maxHexNumber();
        System.out.println(num.getHex());


    }
}
