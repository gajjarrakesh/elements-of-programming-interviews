package strings;

import org.junit.jupiter.api.Test;

import static strings.RunLengthEncoding.encode;
import static strings.RunLengthEncoding.decode;
import static org.junit.jupiter.api.Assertions.*;

class RunLengthEncodingTest {

    private String expected;
    private String input;


    @Test
    void encode1() {
        expected = "4a1b3c2a";
        input = "aaaabcccaa";

        testEncode(expected, input);
    }

    @Test
    void encode2() {
        expected = "3e4f2e";
        input = "eeeffffee";

        testEncode(expected, input);
    }

    private void testEncode(String expected, String input) {
        assertEquals(expected, encode(input));
    }

    @Test
    void decode1() {
        expected = "aaaabcccaa";
        input = "4a1b3c2a";

        testDecode(expected, input);
    }

    @Test
    void decode2() {
        expected = "eeeffffee";
        input = "3e4f2e";

        testDecode(expected, input);
    }

    private void testDecode(String expected, String input) {
        assertEquals(expected, decode(input));
    }

}