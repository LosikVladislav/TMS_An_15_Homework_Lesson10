package part1;

import part1.treatment.Treatment;

public class Main {
    public static void main(String[] args) {
        String str1 = "1478-ABC-8965-Tyg-7t5Y";
        String str2 = "5557-JRq-8865-PoA-7V4Y";
        String str3 = "1798-QRq-7865-PIC-1a2B";

        System.out.println(Treatment.makeIntoTwoBlocks(str1));
        System.out.println(Treatment.changeCharacter(str2));
        System.out.println(Treatment.getLetters(str3));
        System.out.println(Treatment.getLettersUp(str1));
        System.out.println(Treatment.checkForAvailability(str1));
        System.out.println(Treatment.checkStart(str2));
        System.out.println(Treatment.checkEnd(str3));
    }
}
