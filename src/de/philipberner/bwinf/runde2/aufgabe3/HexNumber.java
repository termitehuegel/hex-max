package de.philipberner.bwinf.runde2.aufgabe3;


public class HexNumber implements Comparable<HexNumber>{
    //Hexadecimal representation of the Number - all UPPERCASE
    private final String hex;
    //the value of the digits (digit[0] is the digit at the left end)
    private final int[] digits;

    public HexNumber(String hex) {
        this.hex = hex;
        this.digits = calculatePlaceValues();
    }

    public HexNumber (int[] digits) {
        this.digits = digits;
        this.hex = calculateHex();
    }

    private String calculateHex() {
        StringBuilder s = new StringBuilder();
        //for every digit
        for (int value : digits) {
            //converts the digits value to a string
            s.append(Integer.toHexString(value));
        }
        //builds the String
        return s.toString().toUpperCase();
    }

    private int[] calculatePlaceValues() {
        //gets the characters of the Hex-representation
        char[] chars = hex.toCharArray();
        int[] values = new int[hex.length()];
        //for every digit
        for (int i=0; i<chars.length; i++) {
            //Hex-char to Integer
            values[i] = Integer.parseInt(String.valueOf(chars[i]), 16);
        }
        return values;
    }

    public String getHex() {
        return hex;
    }

    public int[] getDigits() {
        return digits;
    }

    @Override
    public int compareTo(HexNumber o) {
        //converts both objects to Longs and compares them
        return Long.compare(Long.parseLong(hex, 16), Long.parseLong(o.hex, 16));
    }
}
