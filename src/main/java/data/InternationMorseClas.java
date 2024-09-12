package data;

public class InternationMorseClas implements InternationMorse{


    private String translateDecode(String[] str){
        StringBuilder sb = new StringBuilder();
        int index =0;
        while (str[index] != null){
            morseCode_To_Char(str, index, sb);
            index++;
        }
        return sb.toString();
    }

    private String translateEncode(String ch){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length(); i++){
            char_To_morseCode(ch, i, sb);
        }
        return String.valueOf(sb);
    }

    @Override
    public String Encode(String word) {
        return translateEncode(word.toUpperCase());
    }

    @Override
    public String Decode(String word) {
        String[] ch = new String[word.length()];
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        for (int i =0 ; i < word.trim().length(); i++){
            if(word.charAt(i) != ' '){
                stringBuilder.append(word.charAt(i));
                ch[index] = stringBuilder.toString();
            }
            else {
                stringBuilder.delete(0, stringBuilder.length());
                index++;
            }
        }
        return translateDecode(ch);
    }


    private static void char_To_morseCode(String ch, int i, StringBuilder sb) {
        if (ch.charAt(i) == 'A') sb.append(".- ");
        if(ch.charAt(i) == 'B') sb.append("-... ");
        if(ch.charAt(i) == 'C') sb.append("-.-. ");
        if(ch.charAt(i) == 'D') sb.append("-.. ");
        if(ch.charAt(i) == 'E') sb.append(". ");
        if(ch.charAt(i) == 'F') sb.append("..-. ");
        if(ch.charAt(i) == 'G') sb.append("--. ");
        if(ch.charAt(i) == 'H') sb.append(".... ");
        if(ch.charAt(i) == 'I') sb.append(".. ");
        if(ch.charAt(i) == 'J') sb.append(".--- ");
        if(ch.charAt(i) == 'K') sb.append("-.- ");
        if(ch.charAt(i) == 'L') sb.append(".-.. ");
        if(ch.charAt(i) == 'M') sb.append("-- ");
        if(ch.charAt(i) == 'N') sb.append("-. ");
        if(ch.charAt(i) == 'O') sb.append("--- ");
        if(ch.charAt(i) == 'P') sb.append(".--. ");
        if(ch.charAt(i) == 'Q') sb.append("--.- ");
        if(ch.charAt(i) == 'R') sb.append(".-. ");
        if(ch.charAt(i) == 'S') sb.append("... ");
        if(ch.charAt(i) == 'T') sb.append("- ");
        if(ch.charAt(i) == 'U') sb.append("..- ");
        if(ch.charAt(i) == 'V') sb.append("...- ");
        if(ch.charAt(i) == 'W') sb.append(".-- ");
        if(ch.charAt(i) == 'X') sb.append("-..- ");
        if(ch.charAt(i) == 'Y') sb.append("-.-- ");
        if(ch.charAt(i) == 'Z') sb.append("--.. ");
    }
    private static void morseCode_To_Char(String[] str, int index, StringBuilder sb) {
        if(str[index].trim().equals(".-")) sb.append("A");
        if(str[index].trim().equals("-...")) sb.append("B");
        if(str[index].trim().equals("-.-.")) sb.append("C");
        if(str[index].trim().equals("-..")) sb.append("D");
        if(str[index].trim().equals(".")) sb.append("E");
        if(str[index].trim().equals("..-.")) sb.append("F");
        if(str[index].trim().equals("--.")) sb.append("G");
        if(str[index].trim().equals("....")) sb.append("H");
        if(str[index].trim().equals("..")) sb.append("I");
        if(str[index].trim().equals(".---")) sb.append("J");
        if(str[index].trim().equals("-.-")) sb.append("K");
        if(str[index].trim().equals(".-..")) sb.append("L");
        if(str[index].trim().equals("--")) sb.append("M");
        if(str[index].trim().equals("-.")) sb.append("N");
        if(str[index].trim().equals("---")) sb.append("O");
        if(str[index].trim().equals(".--.")) sb.append("P");
        if(str[index].trim().equals("--.-")) sb.append("Q");
        if(str[index].trim().equals(".-.")) sb.append("R");
        if(str[index].trim().equals("...")) sb.append("S");
        if(str[index].trim().equals("-")) sb.append("T");
        if(str[index].trim().equals("..-")) sb.append("U");
        if(str[index].trim().equals("...-")) sb.append("V");
        if(str[index].trim().equals(".--")) sb.append("W");
        if(str[index].trim().equals("-..-")) sb.append("X");
        if(str[index].trim().equals("-.--")) sb.append("Y");
        if(str[index].trim().equals("--..")) sb.append("Z");
    }
}
