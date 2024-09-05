package data;
import java.util.Map;

public class InternationMorseClas implements InternationMorse{
    private final Map<String,String> morseTable = Map.of(
            "A" ,".-",
            "B" , "-...",
            "C", "-.-.",
            "D", "-.."
    );

    public Map<String, String> getMorseTable() {
        return morseTable;
    }

    @Override
    public String Encode() {
        return "";
    }

    @Override
    public String Decode() {
        return "";
    }
}
