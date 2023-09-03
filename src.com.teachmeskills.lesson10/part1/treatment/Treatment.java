package part1.treatment;

public class Treatment {
    public static String makeIntoTwoBlocks(String str) {
        String[] arrayStr = str.split("-");
        return arrayStr[0] + arrayStr[2];
    }
    public static String changeCharacter(String str){
        String[] arrayStr = str.split("-");
        for(int i = 0; i < arrayStr.length; i ++){
            if(i%2!=0){
                arrayStr[i]=arrayStr[i].replaceAll("[a-zA-Z]","*");
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayStr.length; i++) {
            sb.append(arrayStr[i]);
        }
        String strRes = sb.toString();
        return strRes;
    }
    public static String getLetters(String str){
        String[] arrayStr = str.split("-");
        StringBuilder sb = new StringBuilder();
        sb.append(arrayStr[1] + "/");
        sb.append(arrayStr[3] + "/");
        for(int i = 0; i < arrayStr[4].length(); i++){
            if(i%2!=0){
                sb.append(arrayStr[4].charAt(i));
            }
        }
        return sb.toString().toLowerCase();
    }
    public static String getLettersUp(String str){
        String[] arrayStr = str.split("-");
        StringBuilder sb = new StringBuilder();
        sb.append(arrayStr[1] + "/");
        sb.append(arrayStr[3] + "/");
        for(int i = 0; i < arrayStr[4].length(); i++){
            if(i%2!=0){
                sb.append(arrayStr[4].charAt(i));
            }
        }
        return sb.toString().toUpperCase();
    }
    public static  boolean checkForAvailability(String str){
        return str.toLowerCase().contains("abc");
    }
    public static boolean checkStart(String str){
        return str.startsWith("555");
    }
    public static boolean checkEnd(String str){
        return str.toLowerCase().endsWith("1a2b");
    }
}
