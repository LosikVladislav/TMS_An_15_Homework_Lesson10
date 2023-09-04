package part2;

import part2.treatment.Treatment;

public class Main {
    public static void main(String[] args) {
        String str = "Hello.My name is Vladislav,i like study";
        System.out.println(Treatment.findShortWord(str));
        System.out.println(Treatment.findLongWord(str));
        System.out.println(Treatment.duplicateLetters(str));
    }
}
