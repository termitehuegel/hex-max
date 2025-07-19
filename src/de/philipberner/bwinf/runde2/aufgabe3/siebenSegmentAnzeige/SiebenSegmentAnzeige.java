package de.philipberner.bwinf.runde2.aufgabe3.siebenSegmentAnzeige;

import java.util.Arrays;

public class SiebenSegmentAnzeige {
    //numbers[i] =>  i => hex number, numbers[i][j] => which segment is on (starts on top and goes clockwise - center is last)
    public boolean[][] numbers = new boolean[][]{
            {true, true, true, true, true, true, false}, // 0
            {false, true, true, false, false, false, false}, // 1
            {true, true, false, true, true, false, true}, // 2
            {true, true, true, true, false, false, true}, // 3
            {false, true, true, false, false, true, true}, // 4
            {true, false, true, true, false, true, true}, // 5
            {true, false, true, true, true, true, true}, // 6
            {true, true, true, false, false, false, false}, // 7
            {true, true, true, true, true, true, true}, // 8
            {true, true, true, true, false, true, true}, // 9
            {true, true, true, false, true, true, true}, // A
            {false, false, true, true, true, true, true}, // B
            {true, false, false, true, true, true, false}, // C
            {false, true, true, true, true, false, true}, // D
            {true, false, false, true, true, true, true}, // E
            {true, false, false, false, true, true, true}, // F
    };

    public void generateChangeList() {
        int[][][] array = new int[16][16][2];
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                int ilen = 0;
                int jlen = 0;
                int diff = 0;
                for (int k = 0; k < 7; k++) {
                    if (numbers[i][k] != numbers[j][k]) {
                        diff++;
                    }
                    if (numbers[i][k]) {
                        ilen++;
                    }
                    if (numbers[j][k]) {
                        jlen++;
                    }
                }
                array[i][j][0] = diff;
                array[i][j][1] = jlen - ilen;
            }
            //System.out.println(Arrays.deepToString(array[i]));
            for (int k=15; k>=0; k--) {
                for (int l=k+1; l<16; l++) {
                    if (array[i][k][1] == array[i][l][1] && array[i][k][0] >= array[i][l][0] && array[i][l][0] != -1) {
                        array[i][k][0] = -1;
                        break;
                    }
                }
            }
            //System.out.println(Arrays.deepToString(array[i]));

            String s = i + ": ";
            for (int k=15; k>=0; k--) {
                if (array[i][k][0] != -1) {
                    s += "=> " + k + " (" + array[i][k][0] +") (" +  array[i][k][1] +"), ";
                }
            }
            System.out.println(s);
        }
    }

}
