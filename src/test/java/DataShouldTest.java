import data.InternationMorse;
import data.InternationMorseClas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class DataShouldTest {
    InternationMorse morseClas;

    @BeforeEach
    void setUp() {
        morseClas = new InternationMorseClas();
    }


    @Test
    void Check_Data_of_char(){
        String a = "A";
        String b = "B";

        String encodeA = morseClas.Encode(a);
        String encodeB = morseClas.Encode(b);


        assertThat(encodeA).isEqualTo(".- ");
        assertThat(encodeB).isEqualTo("-... ");
    }

    @Test
    void Check_Data_of_string(){
        String hello = "hello";

        String encodeHello = morseClas.Encode(hello);

        assertThat(encodeHello).isEqualTo(".... . .-.. .-.. --- ");
    }
}
