import org.example.service.HelloService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
    @Test
    public void testHello() {
        HelloService service = new HelloService();
        String result = service.hello();
        assertEquals("Hello, World!", result);
    }
}
