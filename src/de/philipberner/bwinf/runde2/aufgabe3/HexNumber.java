package de.philipberner.bwinf.runde2.aufgabe3;


public class HexNumber implements Comparable<HexNumber>{
    private final int value;
    private final String hex;
    private final int[] digits;

    public HexNumber(String hex) {
        this.hex = hex;
        this.digits = calculatePlaceValues();
        this.value = Integer.parseInt(hex, 16);
    }

    public HexNumber (int[] values) {
        this.digits = values;
        this.value = calculateValue();
        this.hex = Integer.toHexString(value).toUpperCase();
    }

    private int calculateValue() {
        int val = 0;
        for (int i=0; i< digits.length; i++) {
            val +=digits[digits.length-1-i] * Math.pow(16, i);
        }
        return val;
    }

    private int[] calculatePlaceValues() {
        char[] chars = hex.toCharArray();
        int[] values = new int[hex.length()];
        for (int i=0; i<chars.length; i++) {
            values[i] = Integer.parseInt(String.valueOf(chars[i]), 16);
        }
        return values;
    }

    public int getValue() {
        return value;
    }

    public String getHex() {
        return hex;
    }

    public int[] getDigits() {
        return digits;
    }

    @Override
    public int compareTo(HexNumber o) {
        return Integer.compare(value, o.getValue());
    }
}
