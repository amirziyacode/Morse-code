package data;

public class InternationMorseClas implements InternationMorse{


    private String Translate(String ch){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length(); i++){
            if (ch.charAt(i) == 'A')sb.append(".- ");
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
        return String.valueOf(sb);
    }

    @Override
    public String Encode(String word) {
        return Translate(word.toUpperCase());
    }

    @Override
    public String Decode(String word) {
        return "";
    }

}
