import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;

class MainTest {
    @Test
    void giorni(){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals("2023-03-08T13:00Z",Main.giorni(data));
    }
    @Test
    void mesi(){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals("2023-02-01T13:00Z",Main.mesi(data));
    }
    @Test
    void anno(){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals("2024-03-01T13:00Z",Main.anno(data));
    }
}