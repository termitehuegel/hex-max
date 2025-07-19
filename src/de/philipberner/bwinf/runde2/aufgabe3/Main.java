package de.philipberner.bwinf.runde2.aufgabe3;

public class Main {

    public static void main(String[] args) {
        HexMax max = new HexMax(8, new HexNumber("509C431B55"));
        HexNumber num = max.maxHexNumber();
        System.out.println(num.getHex());
    }
}
