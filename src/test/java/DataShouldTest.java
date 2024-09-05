import data.InternationMorse;
import data.InternationMorseClas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class DataShouldTest {
    InternationMorseClas morseClas;

    @BeforeEach
    void setUp() {
        InternationMorse morseInterface = new InternationMorseClas();
        InternationMorseClas morseClas = new InternationMorseClas();
    }
    @Test
    void Check_Data(){
        Map<String, String> morseTable = morseClas.getMorseTable();

    }
}
