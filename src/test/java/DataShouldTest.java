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
    void Check_Encode_Data_of_A_B(){
        String a = "A";
        String b = "B";

        String encodeA = morseClas.Encode(a);
        String encodeB = morseClas.Encode(b);


        assertThat(encodeA).isEqualTo(".- ");
        assertThat(encodeB).isEqualTo("-... ");
    }

    @Test
    void Check_Encode_Data_of_hello(){
        String hello = "hello";

        String encodeHello = morseClas.Encode(hello);

        assertThat(encodeHello).isEqualTo(".... . .-.. .-.. --- ");
    }

    @Test
    void check_Decode_Data_of_A_B(){
        String a = ".- ";
        String b = "-... ";


        String decodeA = morseClas.Decode(a);
        String decodeB = morseClas.Decode(b);

        assertThat(decodeA).isEqualTo("A");
        assertThat(decodeB).isEqualTo("B");
    }

    @Test
    void check_Decode_Data_of_Hello(){
        String hello = ".... . .-.. .-.. --- ";

        String decodeHello = morseClas.Decode(hello);

        assertThat(decodeHello).isEqualTo("HELLO");
    }
}
