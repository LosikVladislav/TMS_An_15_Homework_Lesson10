package part2.treatment;

public class Treatment {
    public static String createOneLine(String str){
        if(str.contains(".")){
            str = str.replace("." , " ");
        }
        if(str.contains(",")){
            str = str.replace("," , " ");
        }
        return str;
    }
    public static String findShortWord(String str){
        str = Treatment.createOneLine(str);
        String[] arrayStr = str.split(" ");
        int num = arrayStr[0].length();
        String strResult = "";
        for(int i = 1; i < arrayStr.length; i++){
            if(arrayStr[i].length() <= num){
                num = arrayStr[i].length();
                strResult = arrayStr[i];
            }
        }return strResult;
    }
    public static String findLongWord(String str){
        str = Treatment.createOneLine(str);
        String[] arrayStr = str.split(" ");
        int num = 0;
        String strResult = "";
        for(int i = 0; i < arrayStr.length; i++){
            if(arrayStr[i].length() >= num){
                num = arrayStr[i].length();
                strResult = arrayStr[i];
            }
        }return strResult;
    }
    public static String duplicateLetters (String str){
        str = Treatment.createOneLine(str);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')){
                sb.append(str.charAt(i));
                sb.append(str.charAt(i));
            }else{
                sb.append(str.charAt(i));
            }
        }return sb.toString();
    }
}
