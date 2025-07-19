package de.philipberner.bwinf.runde2.aufgabe3;


public class HexNumber implements Comparable<HexNumber>{
    private final String hex;
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
        for (int value : digits) {
            s.append(Integer.toHexString(value));
        }
        return s.toString().toUpperCase();
    }

    private int[] calculatePlaceValues() {
        char[] chars = hex.toCharArray();
        int[] values = new int[hex.length()];
        for (int i=0; i<chars.length; i++) {
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
        return Long.compare(Long.parseLong(hex, 16), Long.parseLong(o.hex, 16));
    }
}
