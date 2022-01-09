package de.philipberner.bwinf.runde2.aufgabe3;

import de.philipberner.bwinf.runde2.aufgabe3.sevenSegmentDisplay.SevenSegmentDisplay;

public class HexMax {
    private final int moves;
    private final HexNumber number;
    private final int[][][] sensibleMoves;

     HexMax(int moves, HexNumber number) {
        this.moves = moves;
        this.number = number;
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
        this.sensibleMoves = sevenSegmentDisplay.possibleMoves();
    }

    //TODO maxHexNumber
    public void maxHexNumber() {
        for (int i=0; i<number.getPlaceValues().length; i++) {
            for (int j=number.getPlaceValues()[i]; j<16; i++) {
                if (sensibleMoves[number.getPlaceValues()[i]][j][0] <= moves) {

                }
            }
        }
    }


}
