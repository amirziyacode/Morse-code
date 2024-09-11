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
    void Check_Data(){
        String hello = "Hello world";
        assertThat(morseClas.Encode(hello)).contains(".... . .-.. .-.. --- .-- --- .-. .-.. -.. ");
    }
}
