package de.philipberner.bwinf.runde2.aufgabe3;

import de.philipberner.bwinf.runde2.aufgabe3.sevenSegmentDisplay.SevenSegmentDisplay;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SevenSegmentDisplay siebenSegmentAnzeige = new SevenSegmentDisplay();
        siebenSegmentAnzeige.generateChangeList();
        System.out.println(Arrays.deepToString(siebenSegmentAnzeige.possibleMoves()));

    }
}
